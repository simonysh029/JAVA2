package multiplicationTable;

public class MultiplicationTable {
	public static void print() {
		for(int i=1; i<=10; i++) {
			System.out.printf("%d X %d = %d", 5, i, 5*i).println();
		}
	}
	
	public static void print(int number) {
		for(int i=1; i<=10; i++) {
			System.out.printf("%d * %d = %d", number, i, number*i).println();
		}
	}
	
	public static void print(int number, int from, int to) {
		for(int i=from; i<=to; i++) {
			System.out.printf("%d X %d = %d", number, i, number*i).println();
		}
	}
}