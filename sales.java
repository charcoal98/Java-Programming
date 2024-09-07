import java.util.Scanner;

public class sales
{
	public static void main(String[] args)
	{
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		//Variables
		double sales, pay, rate, bonus;
		
		//Input
			//pay
		System.out.print("Enter the salesperson's base pay: ");
		pay = scan.nextDouble();
		while (pay < 0) {
			System.out.println("Input a Positive Number");
			System.out.print("Enter the salesperson's base pay: ");
			pay = scan.nextDouble();
		}
			//sales
		System.out.print("Enter the salesperson's monthly sales: ");
		sales = scan.nextDouble();
		while (sales < 0) {
			System.out.println("Input a Positive Number");
			System.out.print("Enter the salesperson's monthly sales: ");
			sales = scan.nextDouble();
		}
		
		//calc
		if (sales >= 70000) rate = .1;
		else if (sales >= 60000) rate = .07;
		else if (sales >= 50000) rate = .05;
		else rate = .03;
		
		bonus = sales * rate;
		
		//Output
		System.out.printf("Your bonus rate is %.0f%%, your bonus pay is $%,.2f, and total monthly pay is $%,.2f.", (rate * 100), bonus, (pay + bonus));
		
	}
}