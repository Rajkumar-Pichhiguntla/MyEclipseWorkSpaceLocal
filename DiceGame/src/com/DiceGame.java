package com;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
		public static void main(String[] args) throws InterruptedException {
			
			int score=0;
			boolean show=true;
			
			while(show) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter 10 to Roll the Dice: ");
				int Start=sc.nextInt();
				
				System.out.println("Dice Rolling....");
				Thread.sleep(1000);
				
				Random rndm=new Random();
				int diceValue=rndm.nextInt(1,6);
				System.out.println("Dice Value : "+diceValue);
				
				if(diceValue==1) {
					System.out.println("You are out of game..");
					show=false;
					break;
				}
				else {
					score+=diceValue;
				}
				
			}
			System.out.println("Your Final Score = "+score);
			
			
		}
}
