package multiplicationTable;

public class MultiplicationRunner {

	public static void main(String[] args) {
		MultiplicationTable table = new MultiplicationTable();
		table.print();
		table.print(8);
		table.print(6, 11, 20);
	}

}
