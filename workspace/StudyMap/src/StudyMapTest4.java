import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudyMapTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> studentMap = new HashMap();

		studentMap.put("김자바", 90);
		studentMap.put("김자바", 100);
		studentMap.put("이자바", 100);
		studentMap.put("강자바", 80);
		studentMap.put("안자바", 90);
		
		Set set = studentMap.entrySet(); // 순서가 없는 셋으로 옮김
		Iterator it = set.iterator(); // iterator로 다 들고 옴
		
		Map.Entry e = null; // 맵으로 변환 준비
		
		while (it.hasNext()) { // iterator로 옮긴다
			e = (Map.Entry)it.next(); // 맵!
			
			System.out.println("이름: " + e.getKey());
			System.out.println("점수: " + e.getValue());
			System.out.println();
		}
		
		set = studentMap.keySet(); // 키만 모은 세트
		System.out.println("학생들 명단: " + set);
		
		Collection values = studentMap.values(); // 값만 모은 콜렉션
		
		it = values.iterator(); // 값을 iterator로 들고 온다
		
		int total = 0;
		int num = 0;
		while (it.hasNext()) {
			num = (int)it.next();
			total = total + num;
		}
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + (double)total/set.size());
		System.out.println("최고점수: " + Collections.max(values));
		System.out.println("최저점수: " + Collections.min(values));
		
	}

}