public class OnlineWorker extends Worker {
    public static final double INTERNET_FEE = 30.0;

    public OnlineWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Worked hours cannot be negative.");
        }
        return (hoursWorked * getHourlyRate()) + INTERNET_FEE;
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated in OnlineWorker.");
    }
}