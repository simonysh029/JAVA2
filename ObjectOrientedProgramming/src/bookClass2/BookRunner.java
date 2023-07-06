package bookClass2;


public class BookRunner {
	public static void main(String[] args) {
		Book taocp = new Book();
		taocp.setTitle("The Art Of Computer Programming");
		Book ej = new Book();
		ej.setTitle("Effective Java");
		Book cc = new Book();
		cc.setTitle("Clean Code");
		
		System.out.println(taocp.getTitle());
		System.out.println(ej.getTitle());
		System.out.println(cc.getTitle());

		taocp.increaseCopies(10);
		ej.increaseCopies(15);
		cc.increaseCopies(20);
		taocp.decreaseCopies(5);
		ej.decreaseCopies(10);
		cc.decreaseCopies(15);

		System.out.println(taocp.getNumberOfCopies());
		System.out.println(ej.getNumberOfCopies());
		System.out.println(cc.getNumberOfCopies());
	}
}
