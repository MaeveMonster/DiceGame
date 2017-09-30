/**
 * Author: Katie Roy
 * Date: Oct 14, 2015
 * Project: Game.java
 */

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pointsRisked = 0;
		int call = 0;
		//		Die d1 = new Die();
		//		System.out.println("Die 1: " + d1);
		//		d1.roll();
		//		System.out.println("Die 1: " + d1.getRoll());
		Player player1 = new Player();
		//		System.out.println(player1);
		System.out.println("Current Score: " + player1.getScore());
		//		System.out.println("Risking: " + player1.getRisk());
		//		System.out.println("isLow: " + player1.getIsLow());
		//		System.out.println("Sum: " + player1.getSum());
		//		player1.setRisk(50);
		//		System.out.println("Risking: " + player1.getRisk());
		//		player1.setIsLow(0);
		//		System.out.println("isLow: " + player1.getIsLow());
		//		System.out.println("You rolled: " + player1.sumRoll());


		while (pointsRisked != -1){
			System.out.print("Enter the number of points to risk (-1 to quit): ");
			pointsRisked = input.nextInt();
			if( pointsRisked == -1){
				break;
			}
			player1.setRisk(pointsRisked);
			System.out.print("Make a call. ");
			do{
				System.out.print("(0 for low, 1 for high) ");
				if(!input.hasNextInt()){
					System.out.print("Not an integer. Try again. ");
					call = -1;
					input.next();
				}
				else{
					call = input.nextInt();
					if ((call < 0) || (call > 1))
						System.out.print("Invalid range. Try again: ");
				}
			}while ((call < 0) || (call > 1));
			player1.setIsLow(call);
			System.out.println("You rolled: " + player1.sumRoll());
			player1.changeScore();
			System.out.println("You now have " + player1.getScore() + " points.");
		}
		input.close();
	}
}
