import java.util.Scanner;

public class Paint
{
	public static void main(String[] args)
	{
		//var 
		double gal, labor, pCost, lCost, tCost, rooms, tSqrFt = 0, pPrice;
		//scan
		Scanner scan = new Scanner(System.in);
		
		//input
		System.out.println("Enter the number of rooms: ");
		rooms = scan.nextInt();
		while (rooms <= 0) {
			System.out.println("ERROR Enter a number greater than zero: ");
			rooms = scan.nextInt();
		}
		
		System.out.println("Enter the price of paint per gallon: ");
		pPrice = scan.nextDouble();
		while (pPrice <= 0) {
			System.out.println("ERROR Enter a number greater than zero: ");
			pPrice = scan.nextDouble();
		}
		
		for (int i = 0; i < rooms; ++i)
		{
			System.out.println("What is the wall space area in room " + (i+1) + " (in Square Feet): ");
			double ft = scan.nextDouble();
			while (ft <= 0)
			{
				System.out.println("ERROR Enter a number greater than zero: ");
				ft = scan.nextDouble();
			}
			tSqrFt += ft;
		}
		//method Calls 
		gal = gallon(tSqrFt);
		labor = labor(gal);
		pCost = pCost(gal, pPrice);
		lCost = lCost(labor);
		tCost = total(lCost, pCost);
		
		//output
		System.out.printf("Total Wall Space: %.1f\nLabor cost: $%.2f\nPaint cost: $%.2f\nThe total cost of the paint job is: $%.2f", tSqrFt, lCost, pCost, tCost);
	}
	
	//methods could all be in one method but the questions wanted muiltiple returns
	public static double gallon(double ft)
	{
		return ft / 115;
	}
	
	public static double labor(double gal)
	{
		return gal * 8;
	}
	
	public static double pCost(double gal, double price)
	{
		return price * gal;
	}
	
	public static double lCost(double labor)
	{
		return labor * 18;
	}
	
	public static double total(double lCost, double pCost)
	{
		return lCost + pCost;
	}
}