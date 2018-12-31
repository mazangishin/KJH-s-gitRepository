
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "실락원";
		book1.price = 10000;
		
		book2.title = "파우스트";
		book2.price = 12000;
		
		System.out.println(book1.title + "은 " + book1.price + "원이다");
		System.out.println(book2.title + "은 " + book2.price + "원이다");
		
	}

}
