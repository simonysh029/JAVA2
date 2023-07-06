package bookClass3;

public class Book {
	private String title;
	private int numberOfCopies;
	
	public Book(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	
	public void setTitle(String bookTitle) {
		title = bookTitle;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
}
