
public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//정렬
		
		int[] numArr = new int[5];
		int temp = 0;
		boolean check = false;	// 자리바꿈이 발생했는지 체크

		numArr[0] = 5;
		numArr[1] = 8;
		numArr[2] = 2;
		numArr[3] = 10;
		numArr[4] = 7;

		System.out.println("정렬 전");

		for (int i = 0; i < numArr.length; i++) {

			System.out.print(numArr[i] + " ");

		}

		System.out.println();

		for (int i = 0; i < numArr.length; i++) {

			check = false;

			for (int n = 0; n < numArr.length - 1; n++) {

				if (numArr[n] < numArr[n + 1]) {	// 앞의 값이 작으면 서로 바꾼다.

					temp = numArr[n + 1];
					numArr[n + 1] = numArr[n];
					numArr[n] = temp;
					check = true;	// 서로 변경되었으니 자리가 변경되었음을 설정한다.

				}
				
			}
			
			if (check == false) {	// 자리바꿈이 없으면 반복문을 벗어난다.

				break;

			}
		}

		System.out.println("내림차순 정렬 후");

		// 정렬된 결과를 출력한다.
		for (int i = 0; i < numArr.length; i++) {

			System.out.print(numArr[i] + " ");

		}

	}

}
