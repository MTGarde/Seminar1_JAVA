package service;

public class seminar1_pascaltriangle {
	
	public static void main(String[] args) {
		int rows = 5;
		int columns = 1;
		int result;

		try{
			for(int i = 0; i < rows; i++){
				for(int j = 0; j < columns; j++ ){
					result = (factorial(i)/(factorial(j)*factorial(i-j)));
					System.out.print(result+ " ");
				}
				columns++;
				System.out.println();
			}
		}catch(Exception e){System.out.println(e);}

		
	}

	public static int factorial(int number) throws Exception{
		if(number < 0) throw new Exception ("Number is not valid");
		int factorial = 1;

		for(int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}

		return factorial;
	}

}
