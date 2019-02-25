package tg.exam.two;

public class AscendingService {

	int[] ascendingArr = new int[10]; // 배열 생성

	public void numbersCreate() { // main에 있는 이름으로 메서드 생성

		System.out.println("10개의 난수를 생성합니다.");

		for (int i = 0; i < ascendingArr.length; i++) { // 배열에 값을 넣을 for문
			
			ascendingArr[i] = (int) (Math.random() * 99) + 1; // 배열에 랜덤값을 지정
		}
	}

	public void numbersPrint() { // main에서 배열에 있는 값을 모두 출력할 메서드 생성

		System.out.println("[숫자들 조회]"); // 메세지 출력

		for (int i = 0; i < ascendingArr.length; i++) { // 배열에 있는 모든 값을 출력하는 for문
			if (i < 9) {
				System.out.print(ascendingArr[i] + ", "); // 배열에 있는 모든 값을 출력
			}else if (i >= 9){
				System.out.print(ascendingArr[i]);
			}
		}
		System.out.println();
	}

	public void numbersAscending() {

		int temp = 0; // 오름차순 정렬에 쓰일 로컬 변수 생성

		System.out.println("10개의 숫자들을 오름차순으로 정렬합니다"); // 메세지 출력

		for (int i = 0; i < ascendingArr.length; i++) { // 배열의 값을 오름차순으로 정렬할 for문
			
			for (int n = 0; n < ascendingArr.length; n++) { // 배열을 2번 전개한다.
				
				if (ascendingArr[i] < ascendingArr[n]) { // 첫번째로 전개한 배열의 값이
					
					temp = ascendingArr[i]; // 두번째로 전개한 배열의 값보다 크다면
					ascendingArr[i] = ascendingArr[n]; // 값이 0인 temp를 사용해서 숫자를
					ascendingArr[n] = temp; // 바꾼다.
					
				}
			}
		}
	}

}
