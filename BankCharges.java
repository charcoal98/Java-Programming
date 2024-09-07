import java.util.Scanner;

public class BankCharges
{
	public static void main(String[] args)
	{
		//scan
		Scanner scn = new Scanner(System.in);
		//var
		final int base = 10;
		int checks;
		double tFee, cFee;
		//input
		System.out.print("Enter the number of checks writen this month: ");
		checks = scn.nextInt();
		
		//calc
		if (checks >= 60) cFee = checks * .04;
		else if (checks >= 40) cFee = checks * .06;
		else if (checks >= 20) cFee = checks * .08;
		else cFee = checks + .1;
		
		tFee = base + cFee;
		//output
		System.out.printf("The Total Fee This Month is $%,.2f", tFee);
	}
}