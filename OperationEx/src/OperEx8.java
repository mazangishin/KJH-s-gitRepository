
public class OperEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 소수점 내림처리 
		
		double pi = 0.0;
				
		double shortpi = 0.0;
		
		pi = 3.141592;
		
		shortpi = (int)(pi * 1000) / 1000.0;
		
		System.out.println(shortpi);
		
		shortpi = (int)(pi * 10000) / 10000.0;
		
		System.out.println(shortpi);
		
		shortpi = (int)(pi * 100) / 100.0;
		
		System.out.println(shortpi);
		
		/* (int)(pi * 1000) / 1000.0;
		 * (int) 3141.592 / 1000.0;
		 * 3141 / 1000.0;
		 * 3141.0 / 1000.0;
		 * 3.141; */
		
		// 반올림처리
		
		
		double roundPi = 0.0;
		
		
		shortpi = (int)(pi * 1000) / 1000.0;
		
		
		
		roundPi = (int)(pi * 1000 + 0.5);
		// 3141.592 + 0.5 -> (int)3142.092 -> 3142/1000.0
		roundPi = roundPi / 1000.0;
		
		System.out.println("소수점 4째자리에서 반올림 표현 : " + roundPi);
		
		
		
		
	}

}
