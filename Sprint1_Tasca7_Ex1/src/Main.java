public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker("Anna", "Vela", 15.0);
        PresencialWorker w2 = new PresencialWorker("Juan", "Pelayo", 20.0);
        OnlineWorker w3 = new OnlineWorker("Laura", "Bermúdez", 18.0);

        int hours = 40;

        System.out.println("Worker salary: " + w1.calculateSalary(hours));
        System.out.println("Presencial worker salary: " + w2.calculateSalary(hours));
        System.out.println("Online worker salary: " + w3.calculateSalary(hours));
    }
}