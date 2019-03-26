package com.tg.edu;

public class Student {

//	String name;
//	ScoreDto scoreDto;
//	
//	public Student() {
//		scoreDto = new ScoreDto(100, 90);
//	}
//	
//	public void showStudent() {
//		System.out.println("이름은 " + name);
//		String str = scoreDto.toString();
//		System.out.println(str);
//	}
	
	String name;
	ScoreDto scoreDto;
	
	public Student() {
		
	}

	public Student(ScoreDto scoreDto) {
		this.scoreDto = scoreDto;
	}
	
	public void setScore(ScoreDto scoreDto) {
		this.scoreDto = scoreDto;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ScoreDto getScoreDto() {
		return scoreDto;
	}

	public void setScoreDto(ScoreDto scoreDto) {
		this.scoreDto = scoreDto;
	}

	public void showStudent() {
		System.out.println("이름은 " + name);
		String str = scoreDto.toString();
		System.out.println(str);
	}

}
