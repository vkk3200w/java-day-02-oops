
public class Developer extends Employee {

    public Developer(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is developing software.");
    }
}
