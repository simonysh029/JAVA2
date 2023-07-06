package userInput;

import java.util.Scanner;

public class MenuRunner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int number1 = Scanner.nextInt();		
		System.out.println("The number you entered is: " + number1);
	}
}
