public class TestEmployee{
    public static void main(String[] args){
        Employee emp = new Employee("Manvitha", 750000, 2025, "NI12345");
        System.out.println("Name: "+emp.getName());
        System.out.println("Annual Salary: "+emp.getAnnualSalary());
        System.out.println("Year started: "+emp.getYearStarted());
        System.out.println("National Insurance Number: "+emp.getNic());
    }
}