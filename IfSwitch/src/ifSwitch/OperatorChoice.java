package ifSwitch;

public class OperatorChoice {
	private int number1;
	private int number2;
	private int choice;
	
	public OperatorChoice(int number1, int number2, int choice) {
		this.number1 = number1;		
		this.number2= number2;
		this.choice = choice;
	}

	public void operate() {
		System.out.printf("number1 : %d", number1).println();
		System.out.printf("number2 : %d", number2).println();
		System.out.printf("choice : %d", choice).println();
		
		if(choice == 1) {
			System.out.printf("result : %d", number1 + number2).println();
		} else if(choice == 2) {
			System.out.printf("result : %d", number1 - number2).println();
		} else if(choice == 3) {
			System.out.printf("result : %d", number1 * number2).println();
		} else if(choice == 4) {
			System.out.printf("result : %d", number1 / number2).println();
		} else {
			System.out.println("Invalid Operation");
		}
	}
}
