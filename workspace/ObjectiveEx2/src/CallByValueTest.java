
public class CallByValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data d = new Data();
		
		int num = 209;
		
		System.out.println(num);
		
		d.change(num);
		
		System.out.println("수정후");
		System.out.println(num);
		
		
	}

}
