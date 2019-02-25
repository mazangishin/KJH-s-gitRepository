
public class ReferencePramEx2 {

	public static void main(String[] args) {
		
		Data2 data = new Data2();
		
		data.num = 10;
		
		System.out.println("main() : data.num = " + data.num);
		
		data.change(data);
		
		System.out.println("data.change 후");
		System.out.println("main() : data.num = " + data.num);
		
		
		
	}
}