package com.edu.member.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edu.member.vo.MemberVo;

@Repository
public class MemberDaoImpl implements MemberDao{

	@Autowired
	SqlSessionTemplate sqlSession;
	String namespace = "com.edu.member.";
	
	@Override
	public List<MemberVo> memberSelectList() {
		
		List<MemberVo> memberList = null;
		
		memberList = sqlSession.selectList(namespace + "memberSelectList");
		
		return memberList;
	}

	@Override
	public MemberVo memberExist(Map<String, Object> paramMap) {
		
		return sqlSession.selectOne(namespace + "memberExist", paramMap);
	}

	@Override
	public MemberVo memberExist(MemberVo paramMemberVo) {
		return sqlSession.selectOne(namespace + "memberExist1", paramMemberVo);
	}
	
	@Override
	public int memberInsertOne(MemberVo memberVo) {

		return sqlSession.insert(namespace + "memberInsertOne", memberVo);
	}
	
	
}
