package stars;

public class Stars3 {

	public static void main(String[] args) {

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.printf(" ");
			}
			for(int j = 0; j < (5-i); j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}

//*****
// ****
//  ***
//   **
//    *