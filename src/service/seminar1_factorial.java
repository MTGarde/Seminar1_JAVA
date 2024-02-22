package service;

public class seminar1_factorial {

	public static void main(String[] args) {
		int f = 9;
		int atbilde = 1;
		if(f>0) {
			for(int i = 1; i <= f; i++) {
				atbilde = atbilde * i;
			}
			System.out.print("Skaitla " +f+ " faktorialis ir " +atbilde);
		}else {
			System.out.print("Nederigs skaitlis");
		}
		
		
		
	}

}
