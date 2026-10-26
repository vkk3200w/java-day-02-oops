
public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer("Kishore");
        Tester tester = new Tester("kk");

        developer.work();
        developer.writeCode();

        tester.work();
        tester.testSoftware();
    }
}