
public class OperEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		논리연산자
//		| -> or 연산자, & and 연산자
		
		
		int n = 0;
		
		n = 10;
				
		
		System.out.println(n % 2 == 0 || n % 3 == 0);
		System.out.println();
		
		System.out.println(n % 2 == 0 && n % 3 == 0);
		System.out.println();
		
		System.out.println(n++ % 2 == 0 || n++ % 3 == 0);
		System.out.println();
//		처음의 연산에서 true가 나온다면 or 연산자 뒤에 있는 식을 연산하지 않는다. 앞의 연산에서 false가 나온다면 뒤의 식을 연산한다.
//		즉, n은 11이 되며 System.out.println(n++ % 3 == 0 || n++ % 2 == 0); 가 되면 n은 12가 된다.
		
		System.out.println(n++ % 2 == 0 && n++ % 3 == 0);
//		앞의 식이 false면 뒤의 식을 연산하지 않는다. 반대라면 실행시킨다.		
//		즉, n은 12가 되며 System.out.println(n++ % 3 == 0 || n++ % 2 == 0); 가 되면 n은 11이 된다.
		
		
	}

}
