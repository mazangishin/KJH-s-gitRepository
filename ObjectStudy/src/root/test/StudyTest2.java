package root.test;

import root.parent.child.Child2;

public class StudyTest2 {

	public static void main(String[] args) {
	
	Child2 c1 = new Child2();
	Child2 c3 = new Child2("내가 만든 자식");
	
	String resultStr = "";
	
	resultStr = c1.nameView();
		
	System.out.println(resultStr);	


	resultStr = c3.nameView();
	
	System.out.println(resultStr);
	
	}	
	
}
