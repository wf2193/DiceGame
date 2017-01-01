import java.util.Scanner;

public class DiceTest{

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        //Display greeting and menu
        System.out.println("Welcome to Programming Project 3");
        System.out.println("Please choose: ");
        System.out.println();
        System.out.println("Interactive mode: \t press 1");
        System.out.println("Simulation mode: \t press 2");
	
        //get mode of play
        int mode=input.nextInt();
        //create and play the game or simulation
        Game g = new Game(mode);
        g.play();

	}
}

