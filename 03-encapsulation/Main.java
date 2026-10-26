
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException(
                "Salary cannot be negative"
            );
        }
        this.salary = salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Kishore", 35000.0);

        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());

        // Test a valid salary
        emp.setSalary(40000.0);
        System.out.println("Updated salary: " + emp.getSalary());

        // Test an invalid salary
        emp.setSalary(-5000.0);
    }
}
