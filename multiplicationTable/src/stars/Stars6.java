package stars;

public class Stars6 {

	public static void main(String[] args) {

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.printf(" ");
			}
			for(int j = (i*2); j < 2*(5-1)+1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}

//*********
// *******
//  *****
//   ***
//    *
