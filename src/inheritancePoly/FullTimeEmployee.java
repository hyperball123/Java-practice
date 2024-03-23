package inheritancePoly;

public class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + ", Salary: $" + getSalary() + ", Bonus: " + bonus;
    }
}


