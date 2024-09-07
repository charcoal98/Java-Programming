import java.util.Scanner;
import java.util.Random;

public class RPS
{
	public static void main(String[] arg)
	{
		


		//var
		boolean tie = true;
		while (tie) {
			tie = game();
		}
	}
	
	public static boolean game()
	{
		//local var
		String usr;
		int usrInt = 0;
		int winState;
		boolean tie = false;
		
		//scanner
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Rock, Paper, or Scissors: ");
		usr = scan.nextLine();
		while (!(usr.equalsIgnoreCase("rock") || usr.equalsIgnoreCase("paper") || usr.equalsIgnoreCase("scissors")))
		{
			System.out.println("ERROR");
			System.out.println("Enter Rock, Paper, or Scissors: ");
			usr = scan.nextLine();
		}
		
		if (usr.equalsIgnoreCase("rock"))
			usrInt = 1;
		else if (usr.equalsIgnoreCase("paper"))
			usrInt = 2;
		else if (usr.equalsIgnoreCase("scissors"))
			usrInt = 3;
		
		winState = comWin(comChoice(), usrInt);
		
		if (winState == 2) tie = true;
		else if (winState == 1) 
			System.out.println("Player Wins");
		else if (winState == 0)
			System.out.println("Computer Wins");
		return tie;
	}
	
	public static int comChoice(){
		//random
		Random rand = new Random();
		int com = rand.nextInt(3) + 1;
		switch (com)
		{
			case 1:
				System.out.println("\nComputer Picks Rock");
				break;
			case 2:
				System.out.println("\nComputer Picks Paper");
				break;
			case 3: 
				System.out.println("\nComputer Picks Scissors");
				break;
		}
		return com;
	}
	
	public static int comWin (int com, int usr)
	{
		//1 = Rock
		//2 = Paper
		//3 = Scissors
		if (com == usr){
			System.out.println("Tie Play again\n");
			return 2;//com tie
		}
		else if (com == 1){ // com chose ROCK
			if (usr == 2) {
				System.out.println("Paper wraps rock");
				return 1; //com loss
			}
			else if (usr == 3) {
				System.out.println("The rock smashes the scissors");
				return 0;//com win
			}
		}
		else if (com == 2){ // com chose PAPER
			if (usr == 3) {
				System.out.println("Scissors cuts paper");
				return 1; //com loss
			}
			else if (usr == 1) {
				System.out.println("Paper wraps rock");
				return 0;//com win
			}
		} 
		else if (com == 3){// com chose SCISSORS
			if (usr == 1) {
				System.out.println("The rock smashes the scissors");
				return 1; //com loss
			}
			else if (usr == 2) {
				System.out.println("Scissors cuts paper");
				return 0;//com win
			}
		}
		return 2;
	}
	
}