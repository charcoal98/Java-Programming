public class SalesPrediction{
	public static void main(String[] args){
		//var
			double sales = 0;
			int tSales = 4600000;
			final double percent = 0.62;
		//calc
		sales = tSales * percent;
		System.out.println("East coast sales prediction: $" + sales);
	}
}