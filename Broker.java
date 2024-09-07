import javax.swing.JOptionPane;

public class Broker
{
	public static void main(String[] args)
	{
		//const
		final double sharePrice = 23.87, commissionPercent = .02;
		//var
		int shares;
		double commission, stock, total;
		//input
		String input = JOptionPane.showInputDialog("Enter the number of shares bought: ");
		shares = Integer.parseInt(input);
		//calc
		stock = shares * sharePrice;
		commission = stock * commissionPercent;
		total = stock + commission;
		//output
		System.out.println("Price of the Stocks: " + stock);
		System.out.println("Commission Fee: " + commission);
		System.out.println("Total Price: " + total);
	}
}