public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        PresencialWorker pw = new PresencialWorker("John", "Brown", 20.0);
        OnlineWorker ow = new OnlineWorker("Laura", "Johnson", 18.0);

        int hours = 40;

        System.out.println("Presencial worker salary: " + pw.calculateSalary(hours));
        System.out.println("Online worker salary: " + ow.calculateSalary(hours));

        pw.oldMethod();
        ow.oldMethod();
    }
}