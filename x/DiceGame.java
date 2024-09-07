import java.util.Scanner;
import java.util.Random;

public class DiceGame
{
	public static void main(String[] arg)
	{
		//Define Classes
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		//var
		int comWin = 0, tie = 0, usrWin = 0, comN, usrN;
		//loop
		for (int i = 0; i < 10; ++i){
			comN = rand.nextInt(6) + 1;
			usrN = rand.nextInt(6) + 1;
			if (comN > usrN) comWin++;
			else if (comN < usrN) usrWin++;
			else tie++;
		}
		//output
		System.out.println("Computer...." + comWin);
		System.out.println("User........" + usrWin);
		System.out.println("Ties........" + tie);
		if (comWin > usrWin) System.out.println("The computer is the grand winner!");
		else if (comWin < usrWin) System.out.println("The user is the grand winner!");
		else System.out.println("Over all Tie");
	}
}