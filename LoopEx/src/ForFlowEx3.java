
public class ForFlowEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		중첩 for문
		
		
		for (int i = 2; i < 10; i++) {
			
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + (i*j) + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		for (int i = 1; i < 10; i++) {
						
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + (i*j) + "\t");
				
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		
	}
		
}
