package service;
import java.util.Arrays;
import java.util.Random;

public class seminar1_arrays {
	int i = 0;
	public static void main(String[] args) {
		try {
			double mas[] = generateArray(10, 0.0, 5.0);
			System.out.println(Arrays.toString(mas));
			System.out.println();
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	
	
	public static double[] generateArray(int N, double lower, double upper) throws Exception {
		if(N <= 0 || upper < lower) throw new Exception("Wrong imput parameters");
		
		double[] result = new double[N];
		Random rand = new Random();
		
		for(int i = 0; i < result.length; i++) {
			result[i] = rand.nextDouble(lower, upper);
		}
		
		return result;
	}
	
	
	public static double getMean(double[] array) throws Exception {
		if(array == null) throw new Exception("Wrong imput parameter");
		double sum = 0;
		
		//tips mainigais : masivs kuram iet cauri
		for(double temp : array) {
			sum += temp;
		}
		
		return sum/array.length;
	}
	
	
	public static double getMax(double[] array) throws Exception{
		if(array == null) throw new Exception("Wrong imput parameter");
		double max = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(max < array[i]){
				max = array[i];
			}
		}
		
		return max;
	}
	
	
	public static double getMin(double[] array) throws Exception{
		if(array == null) throw new Exception("Wrong imput parameter");
		double min = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(min > array[i]){
				min = array[i];
			}
		}
		
		return min;
	}
//	double[] arraySort(double[] array) {
//		
//	array.sort()
//	}

}
