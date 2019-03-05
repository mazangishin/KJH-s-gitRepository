import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import jdk.jfr.events.ExceptionThrownEvent;

public class ArrayListTest5 {

	private static final Exception Exception = null;

	public static void main(String[] args) throws java.lang.Exception {
		// TODO Auto-generated method stub

		// iterator : 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화하였다.
		// int[] numArr = new int[10];

		List<Gugudan> numList = new ArrayList();
		Scanner scan = new Scanner(System.in);
		Gugudan gugu = new Gugudan();
		int dan = 0;

		System.out.println("1~9까지의 숫자를 입력해주세요.");
		numList = gugu.setNumDan(dan = scan.nextInt());

		if (dan > 9 || dan < 1) {
			throw Exception;
		}else if (dan <= 9 && dan >= 1) {
			Iterator<Gugudan> it = numList.iterator();
			
			while (it.hasNext()) {
				it.next().printInfo();
			}
		}
	}

}
