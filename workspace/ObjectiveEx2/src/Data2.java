
public class Data2 {

		int num = 0;

		void change(Data2 data2) {
			System.out.println("data2.num의 처음 값: " + data2.num);
			data2.num = 1000;
			System.out.println("매서드를 통해 data2.num의 값 수정");
			System.out.println("data2.num : " + data2.num);
		}
	
}
