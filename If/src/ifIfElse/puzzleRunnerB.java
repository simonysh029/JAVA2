package ifIfElse;


public class puzzleRunnerB {
	public static void main(String[] args) {
		puzzleFive();
	}

	public static void puzzleFive() {
		int number = 5;
		if(number < 0)
		number = number + 10;
		number++;
		System.out.println(number);
	}
}
