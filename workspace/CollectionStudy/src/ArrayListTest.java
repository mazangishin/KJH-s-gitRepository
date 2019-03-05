import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		ArrayList list = new ArrayList();
//
//		for (int i = 0; i < 5; i++) {
//			list.add(i + 1);
//		}
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i) + "\t");
//		}
//
//		System.out.println();
//
//		list.add(0, 0);
//
//		System.out.println("추가후");
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i) + "\t");
//		}
//		System.out.println();

		System.out.println("////////////////////////////////////////////////////////////////");

		int[] numArr = new int[5];
		int[] tempArr = new int[numArr.length + 1];
		int insertNum = 0;

		for (int i = 0; i < 5; i++) {
			numArr[i] = i + 1;
		}

		System.out.println("추가후");

		tempArr[0] = 0;

		for (int i = 0; i < numArr.length; i++) {
			tempArr[i + 1] = numArr[i];
		}

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(tempArr[i] + "\t");
		}
		System.out.println();

		System.out.println("////////////////////////////////////////////////////////////////");

		for (int i = 0; i < numArr.length; i++) {
			tempArr[i] = numArr[i];
		}
		
		tempArr[numArr.length] = 0;
		
		System.out.println("////////////////////////////////////////////////////////////////");
		
		int[] tempArr2 = new int[numArr.length + 1];
		int index = 0;
		
		index = 2;
		
		for (int i = 0; i < numArr.length; i++) {
			if (i < index) {
				tempArr2[i] = numArr[i];
			}else if (i == index) {
				tempArr2[i] = 0;
				tempArr2[i + 1] = numArr[i];
			}else if (i > index) {
				tempArr2[i + 1] = numArr[i];
			}
		}
		
		for (int i = 0; i < index; i++) {
			tempArr2[i] = numArr[i];
		}
		
		tempArr2[index] = 0;
		
		for (int i = index + 1; i < numArr.length; i++) {
			tempArr2[i + 1] = numArr[i];
		}
		
		for (int i = 0; i < tempArr2.length; i++) {
			System.out.print(tempArr2[i] + "\t");
		}
		
	}
}
