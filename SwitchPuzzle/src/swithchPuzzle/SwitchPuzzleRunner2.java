package swithchPuzzle;

public class SwitchPuzzleRunner2 {
	public static void main(String[] args) {
		puzzleTwo();
	}

	public static void puzzleTwo() {
		int number = 2;
		switch(number) {
			case 1:
				System.out.println(1);
			case 2:
			case 3:
				System.out.println("Number is 2 or 3");
				break;			
			default:
				System.out.println("default");
				break;
		}
	}
}
