import java.util.Scanner;

public class IngredientAdjuster 
{
	public static void main(String[] args)
	{
		//obj
		Scanner inp = new Scanner(System.in);
		
		//var
		int cookies = 48;
		double sugar = 1.5/cookies, butter = 1.0/cookies, flour = 2.75/cookies;

	
		//calc
		System.out.print("Enter the number of cookies: ");
		cookies = inp.nextInt();
		sugar = sugar * cookies;
		butter = butter * cookies;
		flour = flour * cookies;
		
		//out
		System.out.println("To make " + cookies + "cookies, you will need: ");
		System.out.println(sugar + " cups of sugar");
		System.out.println(butter + " cups of butter");
		System.out.println(flour + " cups of flour");
	}
}