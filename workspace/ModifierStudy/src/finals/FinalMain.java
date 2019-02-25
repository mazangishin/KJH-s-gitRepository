package finals;

public class FinalMain {

	public static void main(String[] args) {
	

		FinalTest ft = new FinalTest();
		int result = 0;
		result = ft.getMaxSize();
		
		System.out.println(result);
		
		ChildClass childClass = new ChildClass();
		result = childClass.getMaxSize();
		
		System.out.println(result);
	}
}
