package test;

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
		
		ScoreDto scoreDto2 = new ScoreDto(10, 20);
		Student s2 = new Student(scoreDto2);
		s2.name = "홍길동2";
		s2.showStudent();
	}
}
