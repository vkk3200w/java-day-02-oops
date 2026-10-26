
public class Tester extends Employee {

    public Tester(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is testing software.");
    }
}
