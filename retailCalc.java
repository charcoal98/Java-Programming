import java.util.Scanner;

public class retailCalc
{
	public static void main(String[] args)
	{
		//Scanner
		Scanner scan = new Scanner(System.in);
		//var
		double wholesale, markup, retail;
		
		//input
		System.out.print("Input wholesale price: ");
		wholesale = scan.nextDouble();
		
		System.out.print("Input markup percentage (0 - 100): ");
		markup = scan.nextDouble();
		
		retail = calculateRetail(wholesale, (markup / 100));
		System.out.printf("The items Retail Price is: $%.2f", retail);
	}
	
	public static double calculateRetail(double cost, double markup){
		return cost + (cost * markup);
	}
}