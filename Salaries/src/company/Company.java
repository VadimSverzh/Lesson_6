package company;

import employee.Employee;
import employee.EmployeeComparatorTop;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {

    private ArrayList<Employee> employees = new ArrayList<>();
    private BigInteger income = BigInteger.valueOf(0);
    private final BigInteger companyPlan = BigInteger.valueOf(100000000);

    public void hire(Employee hire) {
        employees.add(hire);
    }

    public void hireAll(List<Employee>hireList) {
            employees.addAll(hireList);
    }

    public BigInteger getIncome() {
        return income;
    }

    public void addIncome(BigInteger income) {
        this.income = this.income.add(income);
    }

    public BigInteger getCompanyPlan() {
        return companyPlan;
    }

    public void fire(int fireIndex, Class <? extends Employee> toFireClass, int amountToFire) {
        int amount = 0;
        if (employees.get(fireIndex).getClass().getSimpleName().equals(toFireClass.getSimpleName()) & (amount < amountToFire)){
            employees.remove(fireIndex);
            amount++;
        }
    }

    public ArrayList<Employee> getEmployees(){
        return employees;
    }

    public List<Employee> getTopSalaryStaff (int count) {
        Comparator<Employee> top = new EmployeeComparatorTop();
        employees.sort(top);
        return addEmployees(correctQuerryCount(count));
    }

    public List<Employee> getLowSalaryStaff (int count) {
        Comparator<Employee> low = new EmployeeComparatorTop().reversed();
        employees.sort(low);
        return addEmployees(correctQuerryCount(count));
    }

    private int correctQuerryCount(int count) {
        if (count > employees.size()) {
            count = employees.size();
        }
        return count;
    }

    private List<Employee>addEmployees(int count){
        return employees.subList(0, count);
    }
}
