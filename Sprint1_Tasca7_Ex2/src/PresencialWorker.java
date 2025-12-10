public class PresencialWorker extends Worker {
    public static double fuel = 50.0;

    public PresencialWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked * hourlyRate) + fuel;
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated in PresencialWorker.");
    }
}