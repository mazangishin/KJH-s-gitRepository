package com.edu.member.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.member.dao.MemberDao;
import com.edu.member.vo.MemberVo;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	public MemberDao memberDao;

	
	@Override
	public List<MemberVo> memberSelectList() {
		
//		List<MemberVo> list = memberDao.memberSelectList();
		
		return memberDao.memberSelectList();
	}


	@Override
	public MemberVo memberExist(Map<String, Object> paramMap) {

		MemberVo memberVo = memberDao.memberExist(paramMap);
		
		return memberVo;
	}
	
	@Override
	public MemberVo memberExist(MemberVo paramMemberVo) {

		return memberDao.memberExist(paramMemberVo);
	}
	
	@Override
	public int memberInsertOne(MemberVo memberVo) {

		return memberDao.memberInsertOne(memberVo);
	}
	

}
