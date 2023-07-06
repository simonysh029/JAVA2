package bookClass3;

public class BookRunner {
	public static void main(String[] args) {
		Book taocp = new Book(100);
		taocp.setTitle("The Art Of Computer Programming");
		
		Book ej = new Book(75);
		ej.setTitle("Effective Java");
		
		Book cc = new Book(60);
		cc.setTitle("Clean Code");
		
		System.out.println(taocp.getTitle());
		System.out.println(taocp.getNumberOfCopies());
		
		System.out.println(ej.getTitle());
		System.out.println(ej.getNumberOfCopies());
		
		System.out.println(cc.getTitle());
		System.out.println(cc.getNumberOfCopies());
	}
}
