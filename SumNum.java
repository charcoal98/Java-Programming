import java.util.Scanner;

public class SumNum
{
	public static void main(String[] arg)
	{
		//scan
		Scanner scan = new Scanner(System.in);
		//var
		int num, sum = 0;
		//input
		System.out.print("Enter a positive number: ");
		num = scan.nextInt();
		while (num < 0){
			System.out.println("Error number entered is negative");
			System.out.println("Enter a positive number: ");
			num = scan.nextInt();
		}
		//calc
		for (int i = 1; i <= num; ++i)
		{
			sum += i;
		}
		//output
		System.out.println("The sum is: ");
		System.out.println(sum);
	}
}
		