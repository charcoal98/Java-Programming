import java.util.Scanner;

public class Demo
{
	public static void main(String[] arg)
	{
        //scanner 
        Scanner scan = new Scanner(System.in);

        //var
        int pocketNum;
        
        //input
        System.out.println("Enter Pocket Number: ");
        pocketNum = scan.nextInt();

        while(!(pocketNum >= 0 || pocketNum <= 36)){
            System.out.println("Error enter a number between 0 and 36");
            System.out.println("Enter Pocket Number: ");
            pocketNum = scan.nextInt();
        }

        //RoulettePocket
        RoulettePocket pocket = new RoulettePocket(pocketNum);

        //output
        System.out.println(pocket.getPocketColor());
    }
}