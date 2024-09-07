import java.util.Scanner;

public class Demo
{
	public static void main(String[] arg)
	{
        //vars
        int id = 0, hours;
        String name = "";
        double payRate;
        //Create Object
        Scanner scan = new Scanner(System.in);
        Payroll pay = new Payroll("", 1);

        //input
        System.out.print("Enter the employee's name: ");
        pay.setName(scan.nextLine());
        System.out.print("Enter the employee's ID number: ");
        pay.setId(scan.nextInt());
        System.out.print("Enter the employee's hourly pay rate: ");
        pay.setPay(scan.nextDouble());
        System.out.print("Enter the number of hours worked by the employee: ");
        pay.setHours(scan.nextDouble());

        //output
        System.out.println("\nEmployee Payroll Data");
        System.out.println("Name: " + pay.getName());
        System.out.println("ID Number: " + pay.getId());
        System.out.printf("Hourly pay rate: $%.2f", pay.getPay());
        System.out.println("\nHours worked: " + pay.getHours());
        System.out.printf("Gross pay: $%.2f", pay.getGrossPay());
    }
}