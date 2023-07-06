package ifElseIfElse;

public class IfStatementRunner {
	public static void main(String[] args) {
		// if i is 25, print i = 25
		//if i is 24, print i = 24
		//otherwise, print i != 25 and i != 24

		int i=25;
		if(i == 25) {
			System.out.println("i = 25");
		} else if(i == 24) {
			System.out.println("i = 24"); 
		} else {
			System.out.println("i != 25 and i != 24");
		}
	}
}
