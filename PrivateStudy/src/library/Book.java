package library;

public class Book {

	private String title = "";
	private String author = "";
	private String publisher = "";
	private String publishDate = "";
	private int price = 0;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public int getPrice() {
		return price;
	}
	
//	public void bookPrint () {
//		System.out.println(title);
//		System.out.println(author);
//		System.out.println(publisher);
//		System.out.println(publishDate);
//		System.out.println(price);
//	}
	
	public String toString () {
		String str = "";
		
		str += title + "\n";
		str += author + "\n";
		str += publisher + "\n";
		str += publishDate + "\n";
		str += price + "\n";
		
		return str;
	}
	
	
}
