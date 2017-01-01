//*************************************
// Name: Wan Yu Fung (Alice)
// UNI: wf2193
//
// Player (class)
//	
// Description: ***	ISSUE: Simulator does not distinguish player 1 or 2's roll
//				"guessValue" the computer picks a random number between 24 and 32
//				"int choice" mode 1: human chooses "under or over" "0 or 1"
//				"int choice" mode 2: computer will randomly choose "0 or 1"
//				"int choice" the computer will compare the roll sum
//				"int choice" the computer will match to see if the guess was correct
//
//**************************************

import java.util.Scanner;
import java.util.Random;

public class Player 
{
	private int mode; 
	private Dice dice; 
	private Scanner in;
	

	public Player (int mode) 
	{
		this.mode = mode;
		dice = new Dice();
		in = new Scanner(System.in); 
	}



	public int dieRoll() 
	{
		if (mode == 1) 
		{
			System.out.println("You rolled " + dice.roll() );
		} 
		else if (mode == 2)
		{
			System.out.println("computer rolled " + dice.roll() );	
		}
		return dice.roll();
	}


	public int guessValue ()
	{
		Random x = new Random();
		int numberGuess = x.nextInt(9) + 24;
		System.out.println("Computer guess " + numberGuess );
		{
			return numberGuess;
			//will generate number between 24 and 32
		}

	}



	public int choice (int numberGuess, int diceRollPlayerTwo, int diceRollPlayerOne) 
	{
		if (mode == 1) 
		{
			System.out.println("under or over? (1 for under, 0 for over)");
			int choiceVariable = in.nextInt(); //variable
			int Sum = diceRollPlayerOne + diceRollPlayerTwo;

			if (numberGuess == Sum)
			{
				return 1;
			}

			else if( numberGuess < Sum) // declare value
			{
				if (choiceVariable == 1)
				{
					return 1;
				}
				else if (choiceVariable == 0)
				{
					return 2;
				}
			}

			else if (numberGuess > Sum)
			{
				if (choiceVariable == 0)
				{
					return 1;
				}
				else if (choiceVariable == 1)
				{
					return 2;
				}
			}
		}

		else if (mode == 2) 
		{
			Random com = new Random();
			int choiceVariable = com.nextInt(2); //variable
			int Sum = diceRollPlayerOne + diceRollPlayerTwo;

			if (numberGuess == Sum)
			{
				return 1;
			}

			else if( numberGuess < Sum) // declare value
			{
				if (choiceVariable == 1)
				{
					return 1;
				}
				else if (choiceVariable == 0)
				{
					return 2;
				}
			}

			else if (numberGuess > Sum)
			{
				if (choiceVariable == 0)
				{
					return 1;
				}
				else if (choiceVariable == 1)
				{
					return 2;
				}
			}
		}
		return 0;
	}
}
