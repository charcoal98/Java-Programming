import java.util.Scanner;

public class Main {

  public static void main(String[] arg) {
    //Scanner
    Scanner scan = new Scanner(System.in);
    //Var
    boolean loop = true;
    int inputInt;
    double inputDouble;

    //BuisnessTrip Class
    BuisnessTrip trip = new BuisnessTrip();
    //core loop
    while (loop) {
      trip.reset();
      //Input

      //days
      System.out.print("Enter number of days on the trip: ");
      inputInt = scan.nextInt();
      trip.setDays(intCheck(inputInt));

      //airfair
      System.out.print("Enter amount of airfare, (if none enter 0): ");
      inputDouble = scan.nextDouble();
      trip.setAirfare(doubCheck(inputDouble));

      //rental
      System.out.print("Enter amount of car rental fees, (if none enter 0): ");
      inputDouble = scan.nextDouble();
      trip.setRental(doubCheck(inputDouble));

      //miles
      System.out.print(
        "Enter number of miles driven on the trip if private vehicle was used, (if not enter 0): "
      );
      inputInt = scan.nextInt();
      trip.setMiles(intCheck(inputInt));

      //parking fees
      System.out.print("Enter amount of parking fees, (if none enter 0): ");
      inputDouble = scan.nextDouble();
      trip.setParking(doubCheck(inputDouble));

      //taxi charges
      System.out.print("Enter amount of taxi charges, (if none enter 0): ");
      inputDouble = scan.nextDouble();
      trip.setTaxi(doubCheck(inputDouble));

      //Conference
      System.out.print(
        "Enter total Conference or seminar registration fees, (if none enter 0): "
      );
      inputDouble = scan.nextDouble();
      trip.setRegistration(doubCheck(inputDouble));

      //lodging
      System.out.print("Enter lodging charges, per night: ");
      inputDouble = scan.nextDouble();
      trip.setLodging(doubCheck(inputDouble));

      //Output
      System.out.printf("Total Spent: $%,.2f\n", trip.getExpenses());
      System.out.printf("Total Allowable: $%,.2f\n", trip.getReimbersement());
      if (trip.getExcess() < 0) System.out.printf(
        "Amount saved: $%,.2f\n",
        (trip.getExcess() * -1)
      ); else System.out.printf("Excess Amount: $%,.2f\n", trip.getExcess());

      //Ask to loop
      System.out.print("Would You like to enter anouther trip? (y/n): ");
      scan.nextLine();
      String x = scan.nextLine();
      if (x.equalsIgnoreCase("n")) loop = false;
    }
  }

  //check if the user inputed value is atleast 0
  //int
  public static int intCheck(int in) {
    //Scanner
    Scanner scan = new Scanner(System.in);

    int x = in;
    while (x < 0) {
      System.out.print("Enter a value of at least 0: ");
      x = scan.nextInt();
    }
    return x;
  }

  //double
  public static double doubCheck(double in) {
    //Scanner
    Scanner scan = new Scanner(System.in);

    double x = in;
    while (x < 0) {
      System.out.print("Enter a value of at least 0: ");
      x = scan.nextDouble();
    }
    return x;
  }
}
