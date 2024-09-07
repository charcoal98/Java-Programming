import javax.swing.JOptionPane;

public class ShippingCharges
{
	public static void main(String[] args)
	{
        //var
        double pMile, cost;
        int miles, lbs ;
        //input
        String input = JOptionPane.showInputDialog("Enter the weight, in pounds.");
        lbs = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter the distance to ship, in miles.");
        miles = Integer.parseInt(input);
        //calc
        if (lbs > 10) pMile = 3.80;
        else if (lbs > 6)pMile = 3.70;
        else if (lbs > 2)pMile = 2.20;
        else pMile = 1.10;

        miles /= 500;

        cost = miles * pMile;

        System.out.printf("The shipping charges are $%,.2f", cost);

    }
}