package test;

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
	
	public Student(ScoreDto scoreDto) {
		this.scoreDto = scoreDto;
	}
	
	public void setScore(ScoreDto scoreDto) {
		this.scoreDto = scoreDto;
	}
	
	public void showStudent() {
		System.out.println("이름은 " + name);
		String str = scoreDto.toString();
		System.out.println(str);
	}
	
}
