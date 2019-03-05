import java.util.ArrayList;

public class ArrayListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fisrtPersonAge = 30;		
		int secondPersonAge = 30;		
		int thirdPersonAge = 30;		
		TeamPerson tp = new TeamPerson(1, "장훈일", fisrtPersonAge);
		TeamPerson tp2 = new TeamPerson(2, "조혜선", secondPersonAge);
		TeamPerson tp3 = new TeamPerson(3, "김충현", thirdPersonAge);
		ArrayList list  = new ArrayList();
		
		list.add(tp);
		list.add(tp2);
		list.add(tp3);
		
		for (int i = 0; i < list.size(); i++) {
			((TeamPerson)list.get(i)).printInfo();
		}
		
		tp.setAge(fisrtPersonAge - 1);
		tp2.setAge(secondPersonAge - 1);
		tp3.setAge(thirdPersonAge - 1);
		
		ArrayList listCopy  = new ArrayList();
		
		for (int i = 0; i < list.size(); i++) {
			listCopy.add(list.get(i));
		}
		
		for (int i = 0; i < listCopy.size(); i++) {
			((TeamPerson)listCopy.get(i)).printInfo();
		}		
		
	}

}
