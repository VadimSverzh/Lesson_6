import java.math.BigInteger;

public class TopManager implements Employee {

    private final int minTopManagerFix = 100000;
    private final int maxTopManagerFix = 200000;
    private final BigInteger fix = BigInteger.valueOf(rnd(minTopManagerFix, maxTopManagerFix));
    private final BigInteger percent = BigInteger.valueOf(150);
    private Company company;

    public TopManager (Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public BigInteger getMonthSalary() {
            if (getCompany().getIncome().compareTo(getCompany().getCompanyPlan()) > 0){
            return fix.add((fix.multiply(percent.divide(BigInteger.valueOf(100)))));
            }
            else return fix;
    }

    @Override
    public Enum proffession() {
        return Position.TOPMANAGER;
    }

    private int rnd (int min, int max) {
        max -= min;
        return (int) (Math.random() *  ++max) + min;
    }
}
