package service;

import java.util.Arrays;
import java.util.Random;

public class seminar1_coinflip {

	public static void main(String[] args) {
		try {
			System.out.println(Arrays.toString(coinFlip(100)));
		}catch(Exception e){e.printStackTrace();}
		
		
		try {
			System.out.println(Arrays.toString(rollNumberOfDice(50)));
		}catch(Exception e){e.printStackTrace();}
		
		System.out.println(roll2Dices()+ " time(s)");
	}
	
	public static double[] coinFlip(int N) throws Exception{
		if(N <= 0) throw new Exception("Wrong parameters");
		
		double[] result = new double[3];  //masivs ar 3 nullitem [0, 0, 0]
		
		Random rand = new Random();
		for(int i = 1; i <= N; i++) {
			boolean isHead = rand.nextBoolean();
			
			if(isHead) result[0] = result[0]+1;
			else result[1] = result[1]+1;
			
		}
		
		result[2] = result[0]/result[1];
		
		return result;
	}
	
	public static int diceRoll() {
		Random rand = new Random();
		return rand.nextInt(1, 6);
	}
	
	public static int[] rollNumberOfDice(int N) throws Exception{
		if(N <= 0) throw new Exception("Wrong parameters");
		
		int[] result = new int[5];
		for(int i = 0; i < N; i++) {
			result[diceRoll()-1] += 1;
		}
		
		return result;
	}
	
	public static int roll2Dices() {
		int result = 0;
		int a,b;
		
		do{
			a = diceRoll();
			System.out.print(a);
			b = diceRoll();
			System.out.print(b+ "|");
			result += 1;
		}while(a != b);
		
		return result;
	}

}
