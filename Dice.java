//*************************************
// Name: Wan Yu Fung (Alice)
// UNI: wf2193
//
// Dice (class)
//	
// Description: The sum of four dice will always be between 4 and 24
//				"numberGenerator" is a random number call 
//
//**************************************

import java.util.Random;

public class Dice 
{
	private Random numberGenerator;

	public Dice ()
	{
		numberGenerator = new Random ();
	}
	public int roll ()
	{
		return numberGenerator.nextInt(21) + 4; 
		//will generate number between 4 to 24
	}


}
