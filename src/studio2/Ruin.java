package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How much money will you start with? ");
		int startAmount = in.nextInt();
		
		System.out.println("Input the probability that you will win in a single play: ");
		double winChance = in.nextDouble();
		
		System.out.println("Input win limit: ");
		int winLimit = in.nextInt();
		
		System.out.println("Input total simulations: ");
		int totalSim = in.nextInt();
		
		int totalAmount = startAmount;
		
		
		for (int numberSim = 1; numberSim <= totalSim; numberSim ++) {
			
			
			int numberGames = 0;
			
			String status = "EMPTY";
			
			
			while (totalAmount > 0 && totalAmount < winLimit) 
			{
				
				numberGames ++;
				
				double chance = Math.random();
				boolean win = chance < winChance;
				if(win)
				{
					totalAmount++;
					System.out.println("win | total amount: " + totalAmount);
				}
				else
				{
					totalAmount--;
					System.out.println("lose | total amount: " + totalAmount);
				}
				
			
			if (totalAmount == 0) {
				status = "LOSE";
			}
			else {
				status = "WIN";
			}
			
			
			}
			System.out.println("Simulation " + numberSim + ": " + numberGames + " " + status);
		}
		

	}
}
