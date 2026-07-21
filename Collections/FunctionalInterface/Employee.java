public class Employee {
    private int id;
    private String name;
    private String location;
    private double salary;
    public Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public double getSalary() {
        return salary;
    }
}