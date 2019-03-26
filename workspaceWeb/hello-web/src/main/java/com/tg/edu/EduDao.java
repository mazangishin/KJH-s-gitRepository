package com.tg.edu;

public class EduDao {
	
	public Student getStudent() {
		
		Student student = new Student();
		
		student.setName("박성욱");
		
		return student;
	}
	
//	public ScoreDto getScore() {
//		
//		ScoreDto scoreDto = new ScoreDto();
//		
//		scoreDto.setEng(10);
//		scoreDto.setKor(20);
//		
//		return scoreDto;
//	}

	public int getScore() {
		ScoreDto scoreDto = new ScoreDto();
		int result = 0;
		scoreDto.setEng(10);
		scoreDto.setKor(20);
		
		result = scoreDto.getEng() + scoreDto.getKor(); 
		return result;
	}
}
