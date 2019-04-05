package com.edu.member.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.edu.member.vo.MemberVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*.xml")
public class MemberDaoImplTest {

	@Autowired
	public MemberDaoImpl memberDaoImpl;
	
	@Test
	public void testMemberSelectList() {
//		System.out.println("일단 junit 기본은 됨");
//		List<MemberVo> memberList = memberDaoImpl.memberSelectList();
//		
//		Assert.assertNotNull(memberList);
//		Assert.assertEquals("홍길동", memberList.get(0).getName());
//		Assert.assertTrue("홍길동".equals(memberList.get(0).getName()));
	}

	
}
