package com.egen.vihar.session2.rock_paper_scissors;

import java.util.Scanner;

public class RPSService {
	private String myMove = "";
	private String opponentMove = "";
	private int myPoints = 0;
	private int opponentPoints = 0;
	
	
	public void input() {
		while(true) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your move from 'Rock paper Scissors' and to quit the game enter quit");
		myMove = in.nextLine();
		
		
		//to quit the game
		if(myMove.equalsIgnoreCase("quit"))
		{
			if(opponentPoints > myPoints)
			{
				System.out.println("Opponent wins with "+(opponentPoints - myPoints)+" extra points "+ " where your points are "+myPoints+ " and opponent points are " +opponentPoints );
			}
			else if(myPoints > opponentPoints)
			{
				System.out.println("You win"+(myPoints - opponentPoints )+" extra points" + " where your points are "+myPoints+ " and opponent points are " +opponentPoints);
			
			}
			else {
				System.out.println("It is a tie");
			}
			System.out.println("Thank you for playing");
			break;
		}
		
		//Check for the valid Move
		if(!(myMove.equalsIgnoreCase("Rock") || myMove.equalsIgnoreCase("paper")|| myMove.equalsIgnoreCase("scissors")))
		{
			System.out.println("Your move is not valid");
		}
		//For randomly creating opponent move
		int random = (int)(Math.random() * 3); // this function generate double value

		
//For converting the int into string for move selection
		if(random == 0)
		{
			opponentMove = "Rock";
		}else if(random  == 1)
		{
			opponentMove = "Paper";
		}
		else {
			opponentMove = "Scissors";
		}
		System.out.println("Oppnent move is  "+opponentMove);
		
		
		//Condition for win or lose
		if((myMove.equalsIgnoreCase("rock") && opponentMove.equalsIgnoreCase("rock")) || (myMove.equalsIgnoreCase("paper") && opponentMove.equalsIgnoreCase("paper")) || (myMove.equalsIgnoreCase("scissors") && opponentMove.equalsIgnoreCase("scissors")))
		{
			//System.out.println("It is a tie");
		}
	else if( (myMove.equalsIgnoreCase("rock") && opponentMove.equalsIgnoreCase("paper")) || (myMove.equalsIgnoreCase("paper") && opponentMove.equalsIgnoreCase("scissors")) || (myMove.equalsIgnoreCase("scissors") && opponentMove.equalsIgnoreCase("rock"))   )
		{
		opponentPoints += 1;	
		//System.out.println("Opponent win");
		}
	else {
		myPoints += 1;
		//System.out.println("You win");
	}
	}
		
	}
}
