public class RetailItemRun
{
	public static void main(String[] arg)
	{
		//Objects
		//item 1
		RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
		//item 2
		RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
		//item 3
		RetailItem item3 = new RetailItem();
		item3.setDesc("Shirt");
		item3.setUnits(20);
		item3.setPrice(24.95);
		//output
		/*I'm only going to get individual values for one object 
		because having a printAll statement in the class is cleaner*/
		System.out.println(item1.getDesc());
		System.out.println(item1.getUnits());
		System.out.println(item1.getPrice());
		System.out.println();
		
		item2.printAll();
		item3.printAll();
	}
}