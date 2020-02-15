public class Manager implements Employee {

    private final double fix = 50000.;
    private final double percent = 0.05;
    private final double minAmount = 100000.;
    private final double maxAmount = 1000000.;

    @Override
    public double getMonthSalary() {
        return fix + amount(minAmount, maxAmount) * percent;
    }

    public static double amount (double minAmount, double maxAmount) {
        maxAmount -= minAmount;
        return (Math.random() * ++maxAmount) + minAmount;
    }
}
