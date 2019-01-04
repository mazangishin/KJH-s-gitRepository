
public class NoteBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String brand = "LG";
		int price = 0;
		int hardDisk = 0;
		int memory = 0;

		brand = "LG";
		price = 0;
		hardDisk = 0;
		memory = 0;

		NoteBook noteBook = new NoteBook(1000000, 1024, 8);
		noteBook.info();
		System.out.println();

		NoteBook noteBook2 = new NoteBook(10000, 500, 4);
		noteBook2.info();
		System.out.println();

		NoteBook noteBook3 = new NoteBook(100000, 1024, 16);
		noteBook3.info();
		System.out.println();

	}

}
