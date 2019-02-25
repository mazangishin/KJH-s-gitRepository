
public class CallByReferenceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data2 d2 = new Data2();
		
		d2.num = 309;
		
		System.out.println(d2.num);
		
		d2.change(d2);
		
		System.out.println("수정후");
		System.out.println(d2.num);
		
		
	}

}
