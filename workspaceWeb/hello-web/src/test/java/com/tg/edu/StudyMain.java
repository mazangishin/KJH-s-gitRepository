package com.tg.edu;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudyMain {
	public static void main(String[] args) {

//		Student student = new Student();
//		
//		student.name = "홍길동";
//		student.showStudent();

		ScoreDto scoreDto = new ScoreDto(100, 90);
		Student s = new Student(scoreDto);
		s.name = "홍길동";
		s.showStudent();
		
		AbstractApplicationContext ctx =
				new ClassPathXmlApplicationContext("spring-context.xml");
		
		ScoreDto scoreDto2 = ctx.getBean("scoreDto", ScoreDto.class);
		
		Student s2 = new Student(scoreDto2);
		s2.name = "홍길동2";
		s2.showStudent();
	}
}
