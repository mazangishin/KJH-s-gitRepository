package library;

public class Book {

	private String title = "";
	private String author = "";
	private String publisher = "";
	private String publishDate = "";
	private int price = 0;
	
	public void setTitle (String title) {
		this.title = title;
	}

	public void setAuthor (String author) {
		this.author = author;
	}
	
	public void setPublisher (String publisher) {
		this.publisher = publisher;
	}
	
	public void setPublishDate (String publishDate) {
		this.publishDate = publishDate;
	}
	
	public void setPrice (int price) {
		this.price = price;
	}
	
	public String getTitle () {
		return title;
	}
	
	public String getAuthor () {
		return author;
	}
	
	public String getPublisher () {
		return publisher;
	}
	
	public String getPublishDate () {
		return publishDate;
	}
	
	public int getPrice () {
		return price;
	}
}
