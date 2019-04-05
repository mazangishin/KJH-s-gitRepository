package com.edu.member.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edu.member.service.MemberService;
import com.edu.member.vo.MemberVo;

@Controller
public class MemberController {

	private static Logger log = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	private MemberService memberService;

	// 회원 목록 조회 화면으로
	@RequestMapping(value = "/member/list.do", method = RequestMethod.GET)
	public String memberList(Model model) {

		log.info("Welcome MemberController enter! ");
//		log.debug("msg"); 디버깅 
//		log.trace("msg"); 추적

		List<MemberVo> memberList = memberService.memberSelectList();

		model.addAttribute("memberList", memberList);

		return "member/memberListView";
	}

	@RequestMapping(value = "/auth/login.do", method = RequestMethod.GET)
	public String login(MemberVo memberVo, HttpSession session, Model model) {
		log.debug("Welcome MemberController login 페이지 이동! ");

		return "auth/loginForm";
	}

	@RequestMapping(value="/auth/loginCtr.do", method=RequestMethod.POST)
	public String loginCtr(MemberVo paramMemberVo, HttpSession session, Model model) {
		log.debug("Welcome MemberController loginCtr! " + paramMemberVo);
		
		MemberVo memberVo = memberService.memberExist(paramMemberVo);
		
		String viewUrl = "";
		if (memberVo != null) {
			// 회원이 존재한다면 세션에 담고
			// 회원 전체 조회 페이지로 이동
			session.setAttribute("_memberVo_", memberVo);
			
			viewUrl = "redirect:/member/list.do";
		}else {
				System.out.println("일단 안되는 걸로 치자");
				viewUrl = "/auth/loginFail";
		}
		
		return viewUrl;
	}
	
	@RequestMapping(value = "/auth/logout.do", method = RequestMethod.GET)
	public String logout(HttpSession session, Model model) {
		log.debug("Welcome MemberController logout 페이지 이동! ");

		//세션의 객체들 파기
		session.invalidate();
		
		return "redirect:/auth/login.do";
	}
	
	@RequestMapping(value = "/member/add.do", method = RequestMethod.GET)
	public String memberAdd(Model model) {
		log.debug("Welcome MemberController memberAdd 페이지 이동! ");
		
		return "member/memberForm";
	}
	
	@RequestMapping(value = "/member/addCtr.do", method = RequestMethod.POST)
	public String memberAdd(MemberVo memberVo, Model model) {
		log.debug("Welcome MemberController memberAdd 신규등록 처리! " + memberVo);
		
		memberService.memberInsertOne(memberVo);
		
		return "redirect:/member/list.do";
	}

}
