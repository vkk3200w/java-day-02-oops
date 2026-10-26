public class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }

    public void writeCode() {
        System.out.println(name + " is writing Java code.");
    }
}