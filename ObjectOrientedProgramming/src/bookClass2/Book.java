package bookClass2;


public class Book {
	private String title;
	private int numberOfCopies;

	public void setTitle(String bookTitle) {
		title = bookTitle;
	}

	public String getTitle() {
		return title;
	}

	public void setNumberOfCopies(int numberOfCopies) {	
		if(numberOfCopies > 0) {
			this.numberOfCopies = numberOfCopies;
		}
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void increaseCopies(int howMuch) {
		setNumberOfCopies(numberOfCopies + howMuch);
	}

	public void decreaseCopies(int howMuch) {
		setNumberOfCopies(numberOfCopies - howMuch);
	}
}
