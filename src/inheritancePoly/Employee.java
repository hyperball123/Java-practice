package inheritancePoly;

public class Employee {
    private String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Name: " + name + ", Salary: $" + salary;
    }
}