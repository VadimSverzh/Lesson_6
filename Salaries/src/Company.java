import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {

    private ArrayList<Employee> employees = new ArrayList<>();
    private static BigInteger income = BigInteger.valueOf(0);
    private static final BigInteger companyPlan = BigInteger.valueOf(10000000);
    private int count;

    public Company(int operators, int managers, int topManagers) {
        hireAll(operators, managers, topManagers);
    }

    public void hire(Position position) {
        if (position == Position.OPERATOR) employees.add(new Operator());
        else if (position == Position.MANAGER) employees.add(new Manager());
        else employees.add(new TopManager());
        count++;
    }

    public void hireAll(int operators, int managers, int topManagers) {

        for (int i = 0; i < operators; i++) {
            employees.add(new Operator());
            sumIncome(count);
            count++;
        }

        for (int j = 0; j < managers; j++) {
            employees.add(new Manager());
            sumIncome(count);
            count++;
        }

        for (int k = 0; k < topManagers; k++) {
            employees.add(new TopManager());
            sumIncome(count);
            count++;
        }
    }

    public static BigInteger getIncome() {
        return income;
    }

    public static BigInteger getCompanyPlan() {
        return companyPlan;
    }

    public void fire(int amount) {
        if (amount <= employees.size()) {
            for (int o = 0; o < count; o++) {
                employees.remove(o);
                count = --count;
            }
        }
        else System.out.println("Введенное количество превышает количество сотрудников компании!");
    }

    public List<Employee> getTopSalaryStaff (int count) {
        if (count > employees.size()) {
        count = employees.size();
        }
        Comparator<Employee> top = new EmployeeComparatorTop();
        employees.sort(top);
        ArrayList<Employee> topSalary = new ArrayList<>();
        for (int q = 0; q < count; q++)
        {
            topSalary.add(employees.get(q));
        }
        return topSalary;
    }

    public List<Employee> getLowSalaryStaff (int count) {
        if (count > employees.size()) {
            count = employees.size();
        }
        Comparator<Employee> low = new EmployeeComparatorLow();
        employees.sort(low);
        ArrayList<Employee> lowSalary = new ArrayList<>();
        for (int q = 0; q < count; q++)
        {
            lowSalary.add(employees.get(q));
        }
        return lowSalary;
    }

    private void sumIncome(int sum){
        if (employees.get(sum) instanceof IncomeRecievable) {
            IncomeRecievable incomeRecievable = (IncomeRecievable) (employees.get(sum));
            income = income.add(incomeRecievable.getEmployeeIncome());
        }
    }

    public int getEmployeeAmount(){
        return count;
    }
}
