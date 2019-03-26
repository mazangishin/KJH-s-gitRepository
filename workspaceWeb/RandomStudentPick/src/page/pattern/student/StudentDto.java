package page.pattern.student;

public class StudentDto {

	int studentNumber = 0;
	String studentName = "";
	
	public StudentDto(int studentNumber, String studentName) {
		super();
		this.studentNumber = studentNumber;
		this.studentName = studentName;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
