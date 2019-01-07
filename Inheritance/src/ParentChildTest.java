
public class ParentChildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Parent p = new Parent();
		
		Child c = new Child();
		c.age = 21;
		System.out.println(c.age);
		c.play();
		
		Child2 c2 = new Child2();
		c2.age = 21;
		System.out.println(c2.age);
		c2.study();
		
		System.out.println();
		Grandchild grandC = new Grandchild();
		
		grandC.age = 1;
		System.out.println(grandC.age);
		grandC.play();
		grandC.myIntroduce();

		System.out.println("Parent에서 만든 객체 age의 값은?");
		System.out.println(p.age);
		
		
	}

}
