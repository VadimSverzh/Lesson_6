import java.math.BigInteger;

public class TopManager implements Employee {

    private final int minTopManagerFix = 10000000;
    private final int maxTopManagerFix = 20000000;
    private final BigInteger fix = BigInteger.valueOf(rnd(minTopManagerFix, maxTopManagerFix));
    private final BigInteger percent = BigInteger.valueOf(150);

    public BigInteger getMonthSalary() {
            if (Company.getIncome().compareTo(Company.getCompanyPlan()) > 0){
            return fix.add((fix.multiply(percent.divide(BigInteger.valueOf(100)))));
            }
            else return fix;
    }

    private int rnd (int min, int max) {
        max -= min;
        return (int) (Math.random() *  ++max) + min;
    }
}
