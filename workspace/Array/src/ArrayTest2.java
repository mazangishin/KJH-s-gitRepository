import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] bat = new int[6];
		
		
		bat[0] = 0;
		bat[1] = 10;
		bat[2] = 20;
		bat[3] = 30;
		bat[4] = 40;
		bat[5] = 50;
		
		System.out.println(bat[0]);
		System.out.println(bat[1]);
		System.out.println(bat[2]);
		System.out.println(bat[3]);
		System.out.println(bat[4]);
		System.out.println(bat[5]);
		System.out.println(bat);
		System.out.println();
		
		for (int i = 0; i < 6; i++) {
			bat[i] = (i * 10);	
			
		}	
		
		for (int i = 0; i < 6; i++)
			System.out.println(bat[i]);
		
	}

}
