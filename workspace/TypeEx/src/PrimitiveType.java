
public class PrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//논리형 boolean: false, true 
		//문자형 char: 0~65535
		//정수형 byte, short, int, long
		//  byte: -127~127
		//  short: -32,768 ~32,767
		//  int: -2의 15승 ~ 반대까지 약 +-20억
		//  long: -2의 63승 ~ 반대까지
		//실수형 float, double
		//  float: 1,4E-45 ~ 3,4E38
		//  double: 엄청 크다(long보다 큼)
		
		//boolean
		boolean power = true;
		boolean checked = false;
		
		System.out.println("대답 yes/no, 스위치 on/off");
		System.out.println(power);
		System.out.println(checked);
		System.out.println();
		
		
		//char
		
		char ch = 65;
		
		System.out.println(ch);
		System.out.println();
		
		
//		정수형
//		byte, short, int, long
		
		int num = 10;
		
		System.out.println(num);
		System.out.println();
		
		
		byte b = 127;
		
		b = (byte)(b + 1); // (byte) <--캐스팅
		
		System.out.println(b);
		System.out.println();
		//기본값 = int 큰 수를 나타내기 위해 뒤에 L자를 붙인다. 소문자는 숫자 1과 혼동되기 쉬우므로 대문자.
		
		long bigNum = 3000000000L;
				
		System.out.println("long 타입: " + bigNum);
		System.out.println();
		
		int firstNum = 1500000000;
		int secondNum = 1300000000;
		
		int sum = 0;
		sum = (int)firstNum + secondNum;
		
		System.out.println("총 명품금액: " + sum);
		System.out.println();
		
	//실수형
	//	float, double
		
		float f = 9.123456789101234567890f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;
		
		
		System.out.println(f);
		System.out.println(f2);
		System.out.println(d);
		System.out.println();
		
		
		
		
		
	}

}
