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
	public List<MemberVo> memberSelectList(int start, int end) {
		
//		List<MemberVo> list = memberDao.memberSelectList();
		
		return memberDao.memberSelectList(start, end);
	}


	@Override
	public MemberVo memberExist(Map<String, Object> paramMap) {

		MemberVo memberVo = memberDao.memberExist(paramMap);
		
		return memberVo;
	}

	@Override
	public int memberInsertOne(MemberVo memberVo) {

		return memberDao.memberInsertOne(memberVo);
	}
	
	@Override
		public MemberVo memberSelectOne(int no) {
	
		return memberDao.memberSelectOne(no);
		}
	
	@Override
	public int memberUpdateOne(MemberVo memberVo) {

		return memberDao.memberUpdateOne(memberVo);
	}
	
	@Override
	public int memberDelete(int no) {

		return memberDao.memberDelete(no);
	}
	
	@Override
	public int memberSelectTotalCount() {
	
		return memberDao.memberSelectTotalCount();
	}
}
