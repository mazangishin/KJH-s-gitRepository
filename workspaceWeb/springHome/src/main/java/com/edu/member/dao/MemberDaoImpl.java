package com.edu.member.dao;

import java.util.HashMap;
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
	public List<MemberVo> memberSelectList(int start, int end) {
		
		Map<String, Object> map = new HashMap<>();
		map.put("start", start);
		map.put("end", end);
		
		//List<MemberVo> memberList = null;
		
		//memberList = sqlSession.selectList(namespace + "memberSelectList", map);
		
		return sqlSession.selectList(namespace + "memberSelectList", map);
	}

	@Override
	public MemberVo memberExist(Map<String, Object> paramMap) {
		
		return sqlSession.selectOne(namespace + "memberExist", paramMap);
	}

	@Override
	public int memberInsertOne(MemberVo memberVo) {

		return sqlSession.insert(namespace + "memberInsertOne", memberVo);
	}
	
	@Override
	public MemberVo memberSelectOne(int no) {

		return sqlSession.selectOne(namespace + "memberSelectOne", no);
	}
	
	@Override
	public int memberUpdateOne(MemberVo memberVo) {

		return sqlSession.update(namespace + "memberUpdateOne", memberVo);
	}
	
	@Override
	public int memberDelete(int no) {

		return sqlSession.delete(namespace + "memberDelete", no);
	}
	
	@Override
	public int memberSelectTotalCount() {

		return sqlSession.selectOne(namespace + "memberSelectTotalCount");
	}
	
}
