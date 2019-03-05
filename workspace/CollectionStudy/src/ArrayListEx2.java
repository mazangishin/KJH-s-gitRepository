import java.util.ArrayList;

import team.Team1Data;
import team.Team2Data;
import team.Team3Data;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 리스트는 1차원적인 구조로 데이터를 늘어놓은 형태의 자료구조이다.
//		배열과 흡사하지만 다른 점은 자료를 검색과 추가, 삭제가 아주 용이하다는 것이다.
//		반면에 리스트처럼 1차원적인 구조로 되어있지만 데이터의 추가와 삭제를 제한하여 일정한 규칙으로 추가/삭제를 해야하는 구조도 있다.
//		바로 스택과 큐이다.
		Team1Data t1 = new Team1Data();
		Team2Data t2 = new Team2Data();
		Team3Data t3 = new Team3Data();
		
		t1.setAge(00);
		t1.setName("김준혁");
		t1.setTeamNo(1);
		
		t2.setAge(00);
		t2.setName("박강인");
		t2.setTeamNo(2);
		
		t3.setAge(00);
		t3.setName("최문권");
		t3.setTeamNo(3);
		
		ArrayList javaTeam = new ArrayList();
		
		javaTeam.add(t1);
		javaTeam.add(t2);
		javaTeam.add(t3);
		
		
		
		
	}
}
