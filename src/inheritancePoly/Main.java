package inheritancePoly;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("John Doe", 50000, 5000);
        Employee emp2 = new PartTimeEmployee("Alice Smith", 20, 40);

        // Treating all employees uniformly
        Employee[] employees = {emp1, emp2};
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
