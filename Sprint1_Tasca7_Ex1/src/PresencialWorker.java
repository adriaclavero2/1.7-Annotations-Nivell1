public class PresencialWorker extends Worker {

    public static double fuel = 50.0;

    public PresencialWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Worked hours cannot be negative.");
        }
        return (hoursWorked * getHourlyRate()) + fuel;
    }
}