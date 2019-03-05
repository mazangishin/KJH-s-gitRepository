package team;

public class Team3Data {

	int teamNo = 0;
	int age = 0;
	String name = "";
	
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Team2Data [teamNo=" + teamNo + ", age=" + age + ", name=" + name + "]";
	}
	
	
}
