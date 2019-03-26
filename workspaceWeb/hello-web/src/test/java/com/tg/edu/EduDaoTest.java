package com.tg.edu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EduDaoTest { //클래스명은 동일한 클래스Test 로 한다.
	private AbstractApplicationContext ctx;
	
	@RunWith(SpringJunitClassRunner.class)
	@ContextConfigration("file;scr/main/webapp/WEB=INF/spring/*.xml")
	public void setUp() {
		ctx = new ClassPathXmlApplicationContext("/spring-context.xml");
	}
	
	@Test
	// 메서드의 명명규칙
	// public void test메서드명()
	public void getStudentTest(){
		
		//Student student = ctx.getBean("student", Student.class);
		EduDao eduDao = ctx.getBean("eduDao", EduDao.class);
		
		//Assert.assertEquals("박성욱", eduDao.getStudent().getName());
		
		Assert.assertTrue(eduDao.getStudent().getName().equals("박성욱"));
		//Assert.assertNull(eduDao);
		//Assert.assertNotNull(eduDao);
		
	}
	
//	public void getSumScore(){
//		int sumScore = 0;
//		
//		AbstractApplicationContext ctx =
//				new ClassPathXmlApplicationContext("/spring-context.xml");
//		
//		EduDao eduDao = ctx.getBean("eduDao", EduDao.class);
//		eduDao.getScore().getEng();
//		eduDao.getScore().getKor();
//		
//		sumScore = eduDao.getScore().getEng() + eduDao.getScore().getKor();
//		
//		Assert.assertEquals(30, sumScore);
//	}
	
	@Test
	@Ignore
	public void getSumScore(){
		
		EduDao eduDao = ctx.getBean("eduDao", EduDao.class);
		
	//	Assert.assertEquals(110, eduDao.getTotalScore());
		
		System.out.println(eduDao.getScore());
		Assert.assertEquals(30, eduDao.getScore());
	}

	
}