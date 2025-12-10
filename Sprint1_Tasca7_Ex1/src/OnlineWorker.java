public class OnlineWorker extends Worker {

    public static final double INTERNET_FEE = 30.0;

    public OnlineWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked * hourlyRate) + INTERNET_FEE;
    }
}