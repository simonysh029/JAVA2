package stars;

public class Stars5 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5-i-1; j++) {
				System.out.printf(" ");
			}
			for(int j = 0; j < (2*i + 1); j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}

//    *
//   ***
//  *****
// *******
//*********