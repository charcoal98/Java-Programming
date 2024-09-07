public class Payroll
{
    private String name;
    private int id;
    private double payRate;
    private double hours;

    public Payroll (String empName, int idNum)
    {
        name = empName;
        id = idNum;
        payRate = 0;
        hours = 0;
    }
    //mutator
    public void setName(String empName){
        name = empName;
    }
    public void setId(int idNum){
        id = idNum;
    }
    public void setPay(double empPay){
        payRate = empPay;
    }
    public void setHours(double hour){
        hours = hour;
    }
    //Return
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getPay(){
        return payRate;
    }
    public double getHours(){
        return hours;
    }
    //Calc Gross Pay
    public double getGrossPay(){
        return hours * payRate;
    }
    //PrintOut
    public void print(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(payRate);
        System.out.println(hours);
        System.out.println(this.getGrossPay());
    }
}