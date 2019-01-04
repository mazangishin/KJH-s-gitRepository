
public class Student {

	String name = ""; // 학생이름
	int ban = 0; // 반
	int no = 0; // 번호
	int kor = 0; // 국어성적
	int eng = 0; // 영어성적
	int math = 0; // 수학성적

//	name = "";
//	ban = 0;
//	no = 0;
//	kor = 0;
//	eng = 0;
//	math = 0;
//	sum = 0;
//	ave = 0;

	public Student() {

	}

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		int sum = 0;
		sum = (kor + eng + math);

		return sum;
	}

	double getAverage() {
		double ave = 0;
		double sum = 0;
		sum = (kor + eng + math);
		ave = ((int) ((sum / 3 * 100.0) + 0.5)) / 100.0;
		return ave;
	}

	void print() {

		System.out.println("이름: " + name + " / 반: " + ban + " / 번호 : " + no);
		System.out.println("국어: " + kor + " / 영어: " + eng + " / 수학: " + math);
		System.out.println("총점: " + getTotal());
		System.out.println("평균: " + getAverage());
	}

}
