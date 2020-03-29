package employee;

import company.Company;

import java.math.BigInteger;

public class Operator implements Employee {

    private final int minOperatorFix = 40000;
    private final int maxOperatorFix = 60000;
    private final BigInteger fix = BigInteger.valueOf(rnd(minOperatorFix, maxOperatorFix));
    private Company company;

    public Operator (Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    @Override
    public BigInteger getMonthSalary() {
        return fix;
    }

    @Override
    public Enum profession() {
        return Position.OPERATOR;
    }

    private int rnd (int min, int max) {
        max -= min;
        return (int) (Math.random() *  ++max) + min;
    }
}
