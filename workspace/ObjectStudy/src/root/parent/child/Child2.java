package root.parent.child;

public class Child2 {

	String name = "";
	int age = 0;
	
	public Child2 () {
		super();
		//this(매개변수);
	}
	
	public Child2(String name) {
		this("sdf", 1234);
		this.name = name;
	}
	
	public Child2(String name, int age) {
		super();
//		this.name = name;
		this.name = name;
		this.age = age;
	}
	
	public String nameView() {
		return name;
	}
	
}
