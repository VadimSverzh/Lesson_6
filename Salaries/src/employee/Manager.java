package employee;

import company.Company;

import java.math.BigInteger;

public class Manager implements Employee, IncomeRecievable {

    private final int minManagerIncome = 100000;
    private final int maxManagerIncome = 200000;
    private final BigInteger managerIncome = BigInteger.valueOf(rnd(minManagerIncome, maxManagerIncome));

    private final int minManagerFix = 60000;
    private final int maxManagerFix = 70000;
    private final BigInteger fix = BigInteger.valueOf(rnd(minManagerFix, maxManagerFix));
    private final BigInteger percent = BigInteger.valueOf(5);

    private Company company;

    public Manager (Company company) {
        this.company = company;
        this.company.setIncome(getEmployeeIncome());
    }

    public Company getCompany() {
        return company;
    }

    @Override
    public BigInteger getMonthSalary() {
        return fix.add(managerIncome.multiply(percent.divide(BigInteger.valueOf(100))));
    }

    @Override
    public Enum profession() {
        return Position.MANAGER;
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
