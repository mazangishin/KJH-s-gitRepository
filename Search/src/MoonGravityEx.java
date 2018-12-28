
public class MoonGravityEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 달에 사람들이 이주했을 때 몸무게는 얼마일까?
		
		double weight = 0;
		double moonMyWeight = 0;
		
		// 달의 중력은 지구의 6분의 1이다.
		// 소수점 내림 처리
		
		weight = 74;
		moonMyWeight = (int)((weight / 6) * 10) / 10.0;
		
		System.out.println("나의 몸무게: " + weight);
		System.out.println("달에서의 몸무게: " + moonMyWeight);
		
		
	}

}
