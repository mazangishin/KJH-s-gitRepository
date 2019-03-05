import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 리스트는 1차원적인 구조로 데이터를 늘어놓은 형태의 자료구조이다.
//		배열과 흡사하지만 다른 점은 자료를 검색과 추가, 삭제가 아주 용이하다는 것이다.
//		반면에 리스트처럼 1차원적인 구조로 되어있지만 데이터의 추가와 삭제를 제한하여 일정한 규칙으로 추가/삭제를 해야하는 구조도 있다.
//		바로 스택과 큐이다.
		
		ListUtil lu = new ListUtil();
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add("당연하지");
		
		lu.arrayListAllPrint(list, "list");
		
		ArrayList listCopy = null;
		
		listCopy.add(list.get(0));
		listCopy.add(list.get(1));
		listCopy.add(list.get(2));
		
		lu.arrayListAllPrint(listCopy, "listCopy");
		
		listCopy.add("잘못된 복제");
		
		lu.arrayListAllPrint(list, "list");
		lu.arrayListAllPrint(listCopy, "listCopy");
		
	}

}
