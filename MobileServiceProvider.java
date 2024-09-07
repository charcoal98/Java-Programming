import java.util.Scanner;

public class MobileServiceProvider
{
	public static void main(String[] args)
	{
		//scan
		Scanner scn = new Scanner(System.in);
		//var
		char pkg;
		int min, eMin = 0;
		double rate = 0, addMin = 0, cost;
		
		//input
		System.out.print("select Package (A, B, C): ");
		pkg = scn.nextLine().charAt(0);
		System.out.print("Enter Number of minutes used: ");
		min = scn.nextInt();
		
		if (pkg == 'A') {
			if (min > 450) eMin = min - 450;
			rate = 39.99;
			addMin = eMin * 0.45;
		}
		else if (pkg == 'B') {
			if (min > 900) eMin = min - 900;
			rate = 59.99;
			addMin = eMin * 0.40;
		}
		else if (pkg == 'C') {
			rate = 69.99;
		}
		else System.out.print("Error Invalid Package Choice");
		cost = rate + addMin;
		System.out.printf("The Total charges are $%,.2f", cost);
	}
}