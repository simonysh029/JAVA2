package stars;

public class Stars7 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		for(int i = 1; i < 5; i++) {
			for(int j = 0; j < 5-i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}

//*
//**
//***
//****
//*****
//****
//***
//**
//*