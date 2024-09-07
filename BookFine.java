import java.util.Scanner;

public class BookFine
{
	public static void main(String[] arg)
	{
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		//var
		double books, days;
		double fine;
		
		//input
		System.out.print("Enter the number of books checked out: ");
		books = scan.nextInt();
		while(!(books > 0)){
			System.out.println("ERROR Enter a number greater than zero");
			System.out.print("Enter the number of books checked out: ");
			books = scan.nextInt();
		}
		
		System.out.print("Enter the number of days they are overdue: ");
		days = scan.nextInt();
		while(!(books > 0)){
			System.out.println("ERROR Enter a number greater than zero");
			System.out.print("Enter the number of days they are overdue: ");
			days = scan.nextInt();
		}
		
		fine = calcFine(books, days);
		
		//Output
		
		System.out.printf("The fine for %.0f books and %.0f days late is $%.2f", books, days, fine);
		
	}
	
	public static double calcFine (double books, double days)
	{	
		double fee = 0;
		//calc days above 7
		if (days >= 7) {
			double addDays = days - 7;
			days -= addDays;
			fee += addDays * .20;
		}
		//calc days at or under 7
		fee += days * .10;
		return (fee * books);
  	}

}