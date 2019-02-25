
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = ""; // 학생이름
		int ban = 0; // 반
		int no = 0; // 번호
		int kor = 0; // 국어성적
		int eng = 0; // 영어성적
		int math = 0; // 수학성적

		name = "김준혁";
		ban = 1;
		no = 1;
		kor = 52;
		eng = 50;
		math = 50;

		Student student = new Student("김준혁", 1, 1, 52, 50, 50);
		student.getTotal();
		student.getAverage();
		student.print();

	}

}
