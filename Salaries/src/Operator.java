import java.math.BigInteger;

public class Operator implements Employee {

    private final int minOperatorFix = 4000000;
    private final int maxOperatorFix = 6000000;
    private final BigInteger fix = BigInteger.valueOf(rnd(minOperatorFix, maxOperatorFix));

    @Override
    public BigInteger getMonthSalary() {
        return fix;
    }

    private int rnd (int min, int max) {
        max -= min;
        return (int) (Math.random() *  ++max) + min;
    }
}
