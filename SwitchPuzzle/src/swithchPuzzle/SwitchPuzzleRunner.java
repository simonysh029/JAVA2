package swithchPuzzle;

public class SwitchPuzzleRunner {

	public static void main(String[] args) {
		puzzleOne();
	}
	
	public static void puzzleOne() {
		int number = 2;
		switch(number) {
			case 1:
				System.out.println(1);
			case 2:
				System.out.println(2);
			case 3:
				System.out.println(3);
			default:
				System.out.println("default");
		}
	}
}
