//*************************************
// Name: Wan Yu Fung (Alice)
// UNI: wf2193
//
// Game (class)
//	
// Description: ***ISSUE: the humanRoll will run twice
//				play (mode 1): prints out winner of each round and game
//				play (mode 2): calculates Player1 and Player2 wins for 1000 games
//				"int humanRoll" PlayerOne roll value 
//				"int compRoll" PlayerTwo roll value
//				
//
//**************************************


public class Game {

	private int mode;
	private Player playerOne;
	private Player playerTwo;


	public Game(int mode) {
		this.mode = mode;
		playerOne = new Player(this.mode);
		playerTwo = new Player(this.mode);
		
	}
	
	
	public void play () 
	{ 			
		if (mode == 1)
		{	
			int humanWins = 0;
			int computerWins = 0;

			while (humanWins < 10 && computerWins < 10) 
			{			
				int diceRollPlayerOne = playerOne.dieRoll(); 
				int diceRollPlayerTwo = playerTwo.dieRoll();
				int numberGuess = playerTwo.guessValue();
				int result = playerOne.choice(numberGuess, diceRollPlayerTwo, diceRollPlayerOne); 

				if (result == 1) 
				{ 
					humanWins += 1; 
					System.out.println("You won this round!");
				} else 
				{
					computerWins += 1;
					System.out.println("Computer won this round!");
				}
			}
			if (humanWins == 10) 
			{
				System.out.println("^____^ ^____^ CONGRATZ ! YOU WON THE GAME ! ! ! ^____^ ^____^ ");
			}
			else 
			{
				System.out.println("T_____T  SORRY, You Lost! Computer Won. T______T' ");
			}
			
		} 

		else if (mode == 2) 
		{ 
			int simulationNumber = 0;
			int playerOneWins = 0;
			int playerTwoWins = 0;

			while (simulationNumber < 1000)
			{
				int diceRollPlayerOne = playerOne.dieRoll(); 
				int diceRollPlayerTwo = playerTwo.dieRoll();
				int numberGuess = playerTwo.guessValue();
				int result = playerOne.choice (numberGuess, diceRollPlayerTwo, diceRollPlayerOne); 
				if (result == 1) {
					playerOneWins += 1;
				} else {
					playerTwoWins += 1;
				}
				simulationNumber++;
			}

			System.out.println("Player One won " + playerOneWins + " times");
			System.out.println("Player Two won " + playerTwoWins + " times");
		}
	}

	
	public int humanRoll(Player playerOne)
	// this is to store what the human rolled for easy access later
	{
		int diceRollPlayerOne = playerOne.dieRoll();
		return diceRollPlayerOne;
	}
	
	
	public int compRoll(Player playerTwo)
	// this is to store what the computer rolled for easy access later
	{
		int diceRollPlayerTwo = playerTwo.dieRoll();
		return diceRollPlayerTwo;
	}






}