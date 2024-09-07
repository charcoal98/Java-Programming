import java.util.Scanner;

public class HotelOccupancy
{
	public static void main(String[] arg)
	{
		//scan
		Scanner scan = new Scanner(System.in);
		//var
		int floors;
		double tRooms = 0, tFilled = 0, rate;
		//input
		System.out.print("How many floors does the hotel have? ");
		floors = scan.nextInt();
		while (floors < 1) {
			System.out.println("Number of floors must be atleat one");
			System.out.println("How many floors does the hotel have? ");
			floors = scan.nextInt();
		}
		for(int i = 0; i < floors; ++i){
			System.out.print("How many rooms does floor "+ (i + 1) + " have? ");
			int rooms = scan.nextInt();
			while (rooms < 10){
				System.out.print("Invalid. Enter 10 or more: ");
				rooms = scan.nextInt();
			}
			System.out.print("How many occupied rooms does floor " + (i + 1) + " have? ");
			int filled = scan.nextInt();
			while (filled < 0){
				System.out.print("Invalid. Enter a positive number: ");
				filled = scan.nextInt();
			}
			tRooms += rooms;
			tFilled += filled;
		}
		//calc 
		rate = (tFilled / tRooms)*100;
		System.out.println("Number of rooms: " + tRooms);
		System.out.println("Occupied rooms: " + tFilled);
		System.out.println("Vacant rooms: " + (tRooms - tFilled));
		System.out.printf("Occupancy rate: %.2f%%", rate);
	}
}