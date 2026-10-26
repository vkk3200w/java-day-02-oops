
public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
            new Developer("Kishore", 101, 45000),
            new Tester("kk", 102, 40000),
            new Developer("Arun", 103, 50000)
        };

        for (Employee employee : employees) {
            System.out.println("--------------------");
            employee.displayDetails();
            employee.work();
        }
        employees[0].setSalary(47000);
        System.out.println(employees[0].getSalary());

        System.out.println("--------------------");
        System.out.println("Total employees: " + employees.length);
    }
}
