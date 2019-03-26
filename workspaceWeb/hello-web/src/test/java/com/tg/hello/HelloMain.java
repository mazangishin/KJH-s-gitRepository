package com.tg.hello;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx =
				new ClassPathXmlApplicationContext("spring-context.xml");
		
		HelloDaoTest dao = ctx.getBean("helloDao", HelloDaoTest.class);
		
	//	int result = dao.testAddTwoNumber(5, 57);
		
	//	System.out.println(result);
	}
}
