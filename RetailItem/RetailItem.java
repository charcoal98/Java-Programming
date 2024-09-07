
public class RetailItem
{
	private String description;
	private int unitsOnHand;
	private double price;
	//Constructor
	public RetailItem (String desc, int units, double val){
		description = desc;
		unitsOnHand = units;
		price = val;
	}
	public RetailItem (){
		description = "";
		unitsOnHand = 0;
		price = 0;
	}
	public void setDesc(String desc){
		description = desc;
	}
	public void setUnits(int units){
		unitsOnHand = units;
	}
	public void setPrice(double val){
		price = val;
	}
	public String getDesc(){
		return description;
	}
	public int getUnits(){
		return unitsOnHand;
	}
	public double getPrice(){
		return price;
	}
	public void printAll()
	{
		System.out.println(description);
		System.out.println(unitsOnHand);
		System.out.println(price +"\n");
	}
}
