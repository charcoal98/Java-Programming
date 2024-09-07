import java.util.Scanner;

public class SpeedOfSound
{
	public static void main(String[] args)
	{
		//scan
		Scanner scn = new Scanner(System.in);
		//const
		final int air = 1100, water = 4900, steel = 16400;
		
		//var
		String mat;
		double sec = 0;
		double feet;
		
		//input
		System.out.print("select Material (\"air\", \"water\", or \"steel\"): ");
		mat = scn.nextLine();
		System.out.print("Enter Distance in feet: ");
		feet = scn.nextDouble();
		
		//calc
		if (mat.equalsIgnoreCase("air")) sec = feet / air;
		else if (mat.equalsIgnoreCase("water")) sec = feet / water;
		else if (mat.equalsIgnoreCase("steel")) sec = feet / steel;
		else System.out.println("Error Invalid Material");
		
		//output
		System.out.printf("The sound wave traveled for %.2f", sec);
		
	}
}