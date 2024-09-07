public class BuisnessTrip {

  private int days;
  private double airfare;
  private double rental;
  private int miles;
  private double parking;
  private double taxi;
  private double registration;
  private double lodging;

  private final int meals = 37;
  private final int pFee = 10;
  private final int tFee = 20;
  private final int lFee = 95;
  private final double pVehicle = 0.27;

  public BuisnessTrip() {
    days = 0;
    airfare = 0;
    rental = 0;
    miles = 0;
    parking = 0;
    taxi = 0;
    registration = 0;
    lodging = 0;
  }

  // Mutator Methods
  public void setDays(int x) {
    days = x;
  }

  public void setMiles(int x) {
    miles = x;
  }

  public void setAirfare(double x) {
    airfare = x;
  }

  public void setRental(double x) {
    rental = x;
  }

  public void setParking(double x) {
    parking = x;
  }

  public void setTaxi(double x) {
    taxi = x;
  }

  public void setRegistration(double x) {
    registration = x;
  }

  public void setLodging(double x) {
    lodging = x;
  }

  //Reset all variables
  public void reset(){
    days = 0;
    airfare = 0;
    rental = 0;
    miles = 0;
    parking = 0;
    taxi = 0;
    registration = 0;
    lodging = 0;
  }

  // Access Methods
  public int setDays() {
    return days;
  }

  public int setMiles() {
    return miles;
  }

  public double setAirfare() {
    return airfare;
  }

  public double setRental() {
    return rental;
  }

  public double setParking() {
    return parking;
  }

  public double setTaxi() {
    return taxi;
  }

  public double setRegistration() {
    return registration;
  }

  public double setLodging() {
    return lodging;
  }

  // calculate reimbursment
  public double getReimbersement() {
    double total = 0;

    //meals
    total += meals * days;
    //Airfare
    total += airfare;
    //Rental
    total += rental;
    //parking
    if (parking > 0) total += pFee * days;
    //Registration
    total += registration;
    //lodging
    total += lFee * days;
    //miles driven by private vehicle
    total += pVehicle * miles;
    //taxi
    if (taxi > 0) total += tFee * days;
    return total;
  }

  //calculate Expenses

  public double getExpenses() {
    double total =
      (
        airfare +
        rental +
        parking +
        taxi +
        registration +
        (lodging * days) + (meals * days) + (pVehicle * miles)
      );
    return total;
  }

  //calculate Excess
  //returns negative if the expenses are under the total allowed reimbersement
  public double getExcess() {
    double excess;
    excess = this.getExpenses() - this.getReimbersement();
    return excess;
  }

  //PrintAll Variables for testing purposes
  public void printAll() {
    System.out.println("days " + days);
    System.out.println("miles " + miles);
    System.out.println("airfare " + airfare);
    System.out.println("rental " + rental);
    System.out.println("parking " + parking);
    System.out.println("taxi " + taxi);
    System.out.println("registration " + registration);
    System.out.println("lodging " + lodging);
  }
}
