public class Employee extends Person{
    private double annualSalary;
    private int yearStarted;
    private String nic;
    public Employee(){
    }
    public Employee(String name, double annualSalary,int yearStared,String nic){
        super(name);
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nic = nic;
    }
    public double getAnnualSalary(){
        return annualSalary;
    }
    public void setAnnualSalary(double annualSalary){
        this.annualSalary = annualSalary;
    }
    public int getYearStarted(){
        return yearStarted;
    }
    public void setYearStarted(int yearStarted){
        this.yearStarted = yearStarted;
    }
    public String getNic(){
        return nic;
    }
    public void setNic(String nic){
        this.nic = nic;
    }
}