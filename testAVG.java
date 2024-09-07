import java.util.Scanner;

public class testAVG
{
	public static void main(String[] args)
	{
		//var
		double t1, avg = 0;
		char letter;
		
		//scan
		Scanner scn = new Scanner(System.in);
		
		//input
		for(int i = 0; i < 5; ++i){
			System.out.print("Enter test score # "+ (i + 1) + ": ");
			t1 = scn.nextDouble();
			while (0 > t1 || t1 > 100) {
				System.out.println("Test score should be between 0-100!");
				System.out.print("Enter test score # "+ (i + 1) + ": ");
				t1 = scn.nextDouble();
			}
			letter = determineGrade(t1);
			System.out.println("Test " + t1 +  " Letter grade: " + letter);
			avg += t1;
		}
		
		//calc
		avg = calcAverage(avg);
		
		letter = determineGrade(avg);
		
		System.out.printf("Average test score %.2f%% \n", avg);
		System.out.println("Average Letter grade: " + letter);
	}
	
	public static double calcAverage(double total)
	{
		return total / 5;
	}
	
	public static char determineGrade(double avg)
	{
		char letter;
		if (avg >= 90) letter = 'A';
		else if (avg >= 80) letter = 'B';
		else if (avg >= 70) letter = 'C';
		else if (avg >= 60) letter = 'D';
		else letter = 'F';
		return letter;
	}
}