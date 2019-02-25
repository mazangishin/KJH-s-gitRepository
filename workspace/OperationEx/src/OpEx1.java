
public class OpEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*연산자와 피연산자
		연산자(operator) - 연산을 수행하는 기호
		피연산자 - 연산자의 작업 대상 (변수, 리터럴, 수식 등)
		ex: x + 3 -> 연산자 +/ 피연산자x, 3 
		*/
		
		int num = 0;
		
		num = 1 ;
		
		num = num + 10;
		
		System.out.println(num);
		
		/*산술 변환 - 두 값의 타입을 같게 일치시킨다 (보다 큰 타입으로 일치)
		
		long + int -> long + long -> long
		double + int -> double + double -> double
		double + long -> double + double -> double
		
		피연산자의 타입이 int 보다 작은 타입이면 int로 변환된다.
		byte + short -> int + int -> int
		char + short -> int + int -> int
		
		타입보다 큰 숫자가 오게 되는 경우 overflow 가 발생, 의도하지 않은 값 출력.
		
			
		
		*/
		
		
		
	}

}
