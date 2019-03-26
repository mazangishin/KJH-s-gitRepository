package com.tg.hello;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloDaoTest {

	@Test
	public void testAddTwoNumber() {
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("/spring-context.xml");

		HelloDao helloDao = ctx.getBean("helloDao", HelloDao.class);

		int result = helloDao.addTwoNumber(10, 30);
		//System.out.println(result);

		// Assert.assertEquals(expected, actual);
		// Assert.assertEquals(40, result);
		Assert.assertEquals(50, helloDao.addTwoNumber(10, 40));
	}

	@Test
	public void subTwoNumber() {
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("/spring-context.xml");
		
		HelloDao helloDao = ctx.getBean("helloDao", HelloDao.class);
		
		Assert.assertEquals(9, helloDao.subTwoNumber(10, 1));
	}

}
