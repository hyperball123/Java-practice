package inheritancePoly;

public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name, hourlyRate * hoursWorked); // Pass the initial salary (hourlyRate * hoursWorked)
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getSalary() {
        return super.getSalary(); // Return the base salary
    }

    public String toString() {
        return super.toString() + ", Hours Worked: " + hoursWorked + ", Hourly Rate: $" + hourlyRate;
    }
}