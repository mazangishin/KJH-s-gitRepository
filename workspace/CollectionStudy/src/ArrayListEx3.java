import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 리스트는 1차원적인 구조로 데이터를 늘어놓은 형태의 자료구조이다.
//		배열과 흡사하지만 다른 점은 자료를 검색과 추가, 삭제가 아주 용이하다는 것이다.
//		반면에 리스트처럼 1차원적인 구조로 되어있지만 데이터의 추가와 삭제를 제한하여 일정한 규칙으로 추가/삭제를 해야하는 구조도 있다.
//		바로 스택과 큐이다.
		
		ListUtil lu = new ListUtil();
		
		ArrayList list = new ArrayList();
		
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(6));
		list.add(new Integer(4));
		list.add(new Integer(5));
		
		lu.arrayListAllPrint(list, "list");
		
		ArrayList list2 = new ArrayList(list.subList(1, 4));
		
		lu.arrayListAllPrint(list2, "list2");
		
		Collections.sort(list);
		Collections.sort(list2);
		
		lu.arrayListAllPrint(list, "list");
		lu.arrayListAllPrint(list2, "list2");
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		
		lu.arrayListAllPrint(list2, "list2");
		
		list2.set(3, "AA");
		
		lu.arrayListAllPrint(list, "list");
		lu.arrayListAllPrint(list2, "list2");
		
		
		
		
		
	}

}
