import java.math.BigInteger;

public class Manager implements Employee, IncomeRecievable {

    private final int minManagerIncome = 100000000;
    private final int maxManagerIncome = 200000000;
    private final BigInteger managerIncome = BigInteger.valueOf(rnd(minManagerIncome, maxManagerIncome));

    private final int minManagerFix = 3000000;
    private final int maxManagerFix = 7000000;
    private final BigInteger fix = BigInteger.valueOf(rnd(minManagerFix, maxManagerFix));
    private final BigInteger percent = BigInteger.valueOf(5);

    @Override
    public BigInteger getMonthSalary() {
        return fix.add(managerIncome.multiply(percent.divide(BigInteger.valueOf(100))));
    }

    private int rnd (int min, int max) {
        max -= min;
        return (int) (Math.random() *  ++max) + min;
    }

    @Override
    public BigInteger getEmployeeIncome() {
        return managerIncome;
    }
}
