import java.util.ArrayList;

public class ListUtil {

	int cnt = 1;
	
	void arrayListAllPrint(ArrayList list, String title) {
		System.out.println("==== " + title + " 출력 ==== " + cnt + "번째");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		cnt++;
		System.out.println();
	}
	
}
