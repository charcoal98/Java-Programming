import java.util.Scanner;

public class Demo
{
    public static void main(String[] arg)
    {
        // scanner
        Scanner scan = new Scanner(System.in);
        //vars
        String name;
        String major = "";
        int id;
        double gpa;

        System.out.println("Enter Student's Name: ");
        name = scan.nextLine();

        System.out.println("Enter Student's Major: ");
        major = scan.nextLine();

        System.out.println("Enter Student's ID Number: ");
        id = scan.nextInt();

        System.out.println("Enter Student's GPA: ");
        gpa = scan.nextDouble();

        Student stu = new Student(name, id);
        stu.setMajor(major);
        stu.setGPA(gpa);

        System.out.println("Name: " + stu.getName());
        System.out.println("ID Number: " + stu.getId());
        System.out.println("Major: "+ stu.getMajor());
        System.out.println("GPA: " + stu.getGPA());

    }
}