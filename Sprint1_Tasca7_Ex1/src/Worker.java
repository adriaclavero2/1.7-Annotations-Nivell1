public class Worker {
    private String name;
    private String surname;
    private double hourlyRate;

    public Worker(String name, String surname, double hourlyRate) {
        this.name = name;
        this.surname = surname;
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double calculateSalary(int hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Worked hours cannot be negative.");
        }
        return hoursWorked * hourlyRate;
    }
}