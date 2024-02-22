package service;

import java.util.Arrays;
import java.util.Random;

public class seminar1_matrix {
	
	public static void main(String[] args) {
		try {
			System.out.println(Arrays.deepToString(generateMatrix(5)));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	public static double[][] generateMatrix(int N) throws Exception{
		if(N <= 0) throw new Exception("Wrong input parameters");
		double[][] result = new double[N][N];
		
		Random rand = new Random();
		
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				result[i][j] = rand.nextDouble(0,10);
			}
		}
		
		return result;
	}
	
	
	public static double getProduct(double[][] matrix, int i, int j) throws Exception{
		if(matrix == null || i < 0 || j < 0) throw new Exception("Wrong input parameters");
		double result = 0;
		//reizinat rindas ar kolonnam, pirmo ar pirmo utt
		
		for(int n = 0, m = 0; n < i && m < j; n++, m++) {
			result += matrix[i][m]*matrix[n][j];
		}
		
		return result;
	}
}
