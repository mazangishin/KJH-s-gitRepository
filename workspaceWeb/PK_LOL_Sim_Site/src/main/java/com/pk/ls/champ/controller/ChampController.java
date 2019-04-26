package com.pk.ls.champ.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.pk.ls.champ.service.ChampService;
import com.pk.ls.champ.vo.ChampVo;
import com.pk.ls.champLevel.service.ChampLevelService;
import com.pk.ls.champLevel.vo.ChampLevelVo;
import com.pk.ls.member.vo.MemberVo;
import com.pk.ls.util.Paging;

@Controller
public class ChampController {
	
	private static final Logger log = LoggerFactory.getLogger(ChampController.class);

	@Autowired
	private ChampService champService;
	
	@Autowired
	private ChampLevelService champLevelService;
	
	// 챔피언 리스트 화면 출력 메서드
	@RequestMapping(value = "/champ/champList.hm", method=RequestMethod.GET)
	public String champList(@RequestParam(defaultValue ="1") int curPage,
			@RequestParam(defaultValue ="top") String position,	Model model,
			HttpSession session) {
		
		log.debug("챔피언 목록을 표시합니다. 현재 출력 중인 포지션은 : " + position + "입니다.");
		
        int totalCount = champService.champPositionTotalCount(position);
		Paging champPaging = new Paging(totalCount, curPage);
		int start = champPaging.getPageBegin();
		int end = champPaging.getPageEnd();
		MemberVo memberVo = (MemberVo) session.getAttribute("memberVo");
		
		Map<String, Object> champListMap = 
				champService.champList(position, start, end);
		
		Map<String, Object> pagingMap = new HashMap<>();
		
		List<Map<String, Object>> fileList = 
				(List<Map<String, Object>>)champListMap.get("fileList");
		
		List<Map<String, Object>> champList = 
				(List<Map<String, Object>>)champListMap.get("champList");
		
		pagingMap.put("totalCount", totalCount);
		pagingMap.put("champPaging", champPaging);
		
		model.addAttribute("champList", champList);
		model.addAttribute("pagingMap", pagingMap);
		model.addAttribute("fileList", fileList);
		model.addAttribute("memberVo", memberVo);
		
		return "/champ/champList";
	}
	
	// 챔피언 개별 정보 출력 메서드
	@RequestMapping(value="/champ/champSelectOne.hm", method=RequestMethod.GET)
	public String champSelectOne(int championNumber) {
		log.debug("챔피언 개별 정보를 출력합니다.");
		
		return "/champ/champDetailView";
	}

	@RequestMapping(value="/champ/champCreate.hm", method=RequestMethod.GET)
	public String champCreate(HttpSession httpSession, ChampVo champVo, 
			Model model) {
		log.debug("챔피언 생성 페이지로 이동합니다.");
		
		MemberVo memberVo = (MemberVo) httpSession.getAttribute("memberVo");
		String distinguish = "";
		
		if (memberVo.getAuthority() == "Y") {
			distinguish = "/champ/champCreate";
		}else if (memberVo.getAuthority() != "Y") {
			distinguish = "/mainPage";
		}
		
		return distinguish;
	}
	
	@RequestMapping(value="/champ/champVoSave.hm", method=RequestMethod.POST)
	public String champVoSave(ChampVo champVo, HttpSession httpSession
			, HttpServletRequest request
			, MultipartHttpServletRequest
			multipartHttpServletRequest, Model model) {
		
		log.debug("챔피언 기본 정보를 입력 받습니다. : {}",  champVo);
		
		request.setAttribute("champVo", champVo);
		httpSession.setAttribute("_fileRequest_", multipartHttpServletRequest);
		
		MemberVo memberVo = (MemberVo) httpSession.getAttribute("memberVo");
		String distinguish = "";
		
		if (memberVo.getAuthority() == "Y") {
			distinguish = "/champ/champLevelInput";
		}else if (memberVo.getAuthority() != "Y") {
			distinguish = "/mainPage";
		}
		
		return distinguish;				
	}
		
	@RequestMapping(value = "/champ/champCreateCtr.hm", method=RequestMethod.POST)
	public String champCreateCtr(ChampVo champVo, ChampLevelVo champLevelVo,
			HttpServletRequest httpServletRequest, HttpSession httpSession,
			MultipartHttpServletRequest multipartHttpServletRequest,
			Model model) {
		
		log.debug("챔피언 레벨별 정보 페이지입니다. 현재 저장된 챔피언의 정보 : {}, {}",
				champVo, champLevelVo);	
		log.debug("챔피언 이미지 파일의 정보: {}", multipartHttpServletRequest);
		
		MemberVo memberVo = (MemberVo) httpSession.getAttribute("memberVo");
		String distinguish = "";
		
		if (memberVo.getAuthority() == "Y") {
			distinguish = "/champ/successPage";
		}else if (memberVo.getAuthority() != "Y") {
			distinguish = "/mainPage";
		}
		
		try {
			
			// 챔피언 기본 정보와 이미지 파일 테이블에 값을 입력
			champService.champCreate(champVo, multipartHttpServletRequest);
			System.out.printf("챔피언 기본 정보를 생성했습니다. {}", champVo);
			
			// 챔피언 레벨별 정보를 입력
			champLevelVo.setChampionNumber(champVo.getChampionNumber());
			System.out.println(champVo);
			champLevelService.champLevelCreate(champLevelVo);
			System.out.printf("챔피언 레벨별 정보를 생성했습니다. {}", champLevelVo);
			
		} catch (Exception e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
		
		return distinguish;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/champ/champUpdateCtr.hm")
	public String champUpdate(HttpSession httpSession, int championNumber, 
			Model model) {
		log.debug("Welcome memberUpdate enter! - {}", championNumber);

		MemberVo memberVo = (MemberVo) httpSession.getAttribute("memberVo");
		String distinguish = "";
		
		if (memberVo.getAuthority() == "Y") {
			distinguish = "/champ/champUpdateForm";
		}else if (memberVo.getAuthority() != "Y") {
			distinguish = "/mainPage";
		}
		
		Map<String, Object> map = champService.champSelectOne(championNumber);

		ChampVo champVo = (ChampVo) map.get("champVo");
		List<Map<String, Object>> fileList = 
				(List<Map<String, Object>>)map.get("fileList");

		model.addAttribute("champVo", champVo);
		model.addAttribute("fileList", fileList);

		return distinguish;
	}

	@RequestMapping(value = "/champ/champUpdateCtr.do", method = RequestMethod.POST)
	public String champUpdateCtr(HttpSession httpSession, ChampVo champVo, 
			MultipartHttpServletRequest multipartHttpServletRequest, 
			@RequestParam(value="file_Index", defaultValue="-1") int file_Index, 
			Model model) {
		
		log.debug("챔피언 정보를 업데이트 합니다. 현재 챔피언의 정보 : {} 챔피언 이미지의 고유 번호 : {}",
				champVo, file_Index);

		MemberVo memberVo = (MemberVo) httpSession.getAttribute("memberVo");
		String distinguish = "";
		
		if (memberVo.getAuthority() == "Y") {
			distinguish = "/common/successPage";
		}else if (memberVo.getAuthority() != "Y") {
			distinguish = "/mainPage";
		}
		
		int resultNum = 0;
		try {
			resultNum = champService.champUpdateOne
					(champVo, multipartHttpServletRequest, file_Index);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 데이터베이스에서 회원정보가 수정이 됐는가
		if (resultNum > 0) {
			
		}

		return distinguish;
	}

	
	@RequestMapping(value = "/champ/champDeleteCtr.do", method = RequestMethod.GET)
	public String champDelete(@RequestParam(value = "champNumber") int champNumber,
			HttpSession httpSession, Model model) {
		log.debug("챔피언을 삭제합니다. 삭제할 챔피언의 고유번호: " + champNumber);

		MemberVo memberVo = (MemberVo) httpSession.getAttribute("memberVo");
		String distinguish = "";
		
		if (memberVo.getAuthority() == "Y") {
			distinguish = "redirect:/champ/champList.hm";
		}else if (memberVo.getAuthority() != "Y") {
			distinguish = "/mainPage";
		}
		
		try {
			champService.champDelete(champNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return distinguish;
	}
	
}
