import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// iterator : 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화하였다.
		//int[] numArr = new int[10];
		List<Integer> numList = new ArrayList();
		
		for (int i = 0; i < 5; i++) {
			numList.add(i);
		}
		
		Iterator<Integer> it = numList.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
