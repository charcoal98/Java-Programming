import java.util.Scanner;
import java.io.*;

public class Uppercase
{
	public static void main(String[] arg) throws IOException
	{
		//instances
		Scanner scan = new Scanner(System.in);
		//var
		String file1, file2, fileACont, fileBCont, file1out, file2out;
		//input
		System.out.print("Enter the first file's name: ");
		file1 = scan.nextLine();
		
		//Read file1
		File fileA = new File(file1);
		Scanner inFileA = new Scanner(fileA);
		fileACont = inFileA.nextLine();
		
		System.out.print("Enter the second file's name: ");
		file2 = scan.nextLine();
		
		//Read file 2
		File fileB = new File(file2);
		Scanner inFileB = new Scanner(fileB);
		fileBCont = inFileB.nextLine();
		
		//FileA Logic
		fileACont = fileACont.toUpperCase();
		file1out = "UpperCase" + file1;
		FileWriter fA = new FileWriter(file1out);
		PrintWriter outFA = new PrintWriter(fA);
		outFA.println(fileACont);
		outFA.close();
		//FileB Logic
		fileBCont = fileBCont.toUpperCase();
		file2out = "UpperCase" + file2;
		FileWriter fB = new FileWriter(file2out);
		PrintWriter outFB = new PrintWriter(fB);
		outFB.println(fileBCont);
		outFB.close();
	}
}