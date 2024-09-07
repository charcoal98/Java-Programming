public class Student
{
    private String name;
    private int idNumber;
    private String major;
    private double gpa;

    public Student(String sName, int id){
        name = sName;
        idNumber = id;
        major = "";
        gpa = 0;
    }

    //mutator
    public void setName(String sName){
        name = sName;
    }
    public void setId(int id){
        idNumber = id;
    }
    public void setMajor(String maj){
        major = maj;
    }
    public void setGPA(double score){
        gpa = score;
    }

    //Accessor
    public String getName(){
        return name;
    }
    public int getId(){
        return idNumber;
    }
    public String getMajor(){
        return major;
    }
    public double getGPA(){
        return gpa;
    }
}