package root.parent.child;

public class Child1 {

	String name = ""; 
	
	public Child1 () {
		name = "자식";
	}
	
	public Child1(String name) {
		this.name = name;
	}
	
	public String nameView() {
		return name;
	}
	
}
