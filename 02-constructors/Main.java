class Employee {
    String name;
    int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    void displayDetails() {
        System.out.println(name + " - " + employeeId);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Kishore", 101);
        employee.displayDetails();
    }
}