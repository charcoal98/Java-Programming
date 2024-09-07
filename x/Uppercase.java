import java.util.Scanner;
import java.io.*;

public class Uppercase
{
	public static void main(String[] arg) throws IOException
	{
		//instances
		Scanner scan = new Scanner(System.in);
		//var
		String file1, file2, fileACont, fileBCont;
		//input
		System.out.print("Enter the input file's name: ");
		file1 = scan.nextLine();
		
		//Read file1
		File fileA = new File(file1);
		Scanner inFileA = new Scanner(fileA);
		fileACont = inFileA.nextLine();
		
		System.out.print("Enter the output file's name: ");
		file2 = scan.nextLine();
		
		//Read file 2
		File fileB = new File(file2);
		
		//FileA Logic
		fileACont = fileACont.toUpperCase();
		FileWriter fA = new FileWriter(file2);
		PrintWriter outFA = new PrintWriter(fA);
		outFA.println(fileACont);
		outFA.close();
	}
}