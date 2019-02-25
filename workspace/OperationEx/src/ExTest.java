
public class ExTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 5;
		int n = 0;
		n = i++;
		
/*		n = i++;
		n = 5;
		i = i++;
		i = 6;                즉, n = 5 이고 i = 6 이 된다.       ++은 먼 훗날에
		
*/		
	
		System.out.println(n + i);
		
		
		i = 5;
		n = 0;
		n = ++i;
		
/*		n = ++i;
 * 		n = 6;
 * 		i = 6;
 * 		
 */
		
		
		System.out.println(n + i);
		
		
		
		
		
	}

}
