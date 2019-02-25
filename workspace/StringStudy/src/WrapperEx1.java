
public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int num = new Integer("100").intValue();
//		
//		int num2 = Integer.parseInt("100");
//		
//		Integer num3 = Integer.valueOf("100");
//		
//		System.out.println("num = " + num);
//		System.out.println("num2 = " + num2);
//		System.out.println("num3 = " + num3);
		
		
		// 2019년 02월 25일
		
		String originDate = "2019년02월25일";
		
		int indexYear = originDate.indexOf('년'); // 년의 위치 확인
		System.out.println("년:" + indexYear); // 위치 출력
		int indexMonth = originDate.indexOf('월'); // 월의 위치 확인
		System.out.println("월:" + indexMonth); // 위치 출력
		int indexDate = originDate.indexOf('일'); // 일의 위치 확인
		System.out.println("일:" + indexDate); // 위치 출력
		
		String year = originDate.substring(0, indexYear); //년을 분리
		String month = originDate.substring(indexYear + 1, indexMonth); //월을 분리
		String date = originDate.substring(indexMonth + 1, indexDate); //일을 분리
		
		int intYear = Integer.parseInt(year); // 년을 숫자로 바꿈
		int intMonth = Integer.parseInt(month); // 월을 숫자로 바꿈
		int intDate = Integer.parseInt(date); // 일을 숫자로 바꿈

		String reStrMonth = ""; // 월이 한자릿수일 때 앞에 0 을 담아보자
		String reStrDate = ""; // 일이 한자릿수일 때 앞에 0 을 담아보자
		
		if (intMonth < 10) { // 월이 10보다 작고
			reStrMonth = "0" + String.valueOf(intMonth);
			if (intDate < 10) { // 일이 10보다 작으면
			reStrDate = "0" + String.valueOf(intDate);
			System.out.println(intYear + "년" + reStrMonth + "월" + reStrDate + "일"); // 0을 붙여서 출력함
			}else if (intDate >= 10) { // 일이 10보다 크면
			System.out.println(intYear + "년" + reStrMonth + "월" + intDate + "일"); // 년월일을 붙여 출력함
			}
		}else if (intMonth >= 10) { // 월이 10보다 크고 
			System.out.println(intYear + "년" + intMonth + "월" + intDate + "일"); // 년월일을 붙여 출력함
			if (intDate >= 10) { // 일이 10보다 크면
			System.out.println(intYear + "년" + intMonth + "월" + intDate + "일"); // 년월일을 붙여 출력함
			}else if (intDate < 10) { // 일이 10보다 작으면
				System.out.println(intYear + "년" + intMonth + "월" + reStrDate + "일"); // 년월일을 붙여 출력함
			}
		}
		
		// 배열을 써서 담아보자. 그것도 한 번에.
		int[] calendar = new int[3];
		calendar[0] = Integer.parseInt(originDate.substring(0, indexYear));
		// 년을 분리해서 숫자로 바꾸어 담는다.
		calendar[1] = Integer.parseInt(originDate.substring(indexYear + 1, indexMonth));
		// 월을 분리해서 숫자로 바꾸어 담는다.
		calendar[2] = Integer.parseInt(originDate.substring(indexMonth + 1, indexDate));
		// 일을 분리해서 숫자로 바꾸어 담는다.
		
		System.out.println(calendar[0] + "년" + calendar[1] + "월" + calendar[2] + "일");
		
		
		
//		int firstStr = new Integer("300");
//		int secondStr = new Integer("200");
//		System.out.println(firstStr + secondStr);
		
		// 한 번에 하지 말고 천천히 해 보자.
		String firstStr = "300";
		String secondStr = "200";
		
		int strToInt1 = Integer.parseInt(firstStr);
		int strToInt2 = Integer.parseInt(secondStr);
		int sum = strToInt1 + strToInt2;
		System.out.println("두 문자를 합하면 : " + sum);
		
		
	}

}
