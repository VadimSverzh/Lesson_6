package company;

import employee.Employee;
import employee.EmployeeComparatorTop;
import employee.EmployeeComparatorLow;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {

    private ArrayList<Employee> employees = new ArrayList<>();
    private BigInteger income = BigInteger.valueOf(0);
    private final BigInteger companyPlan = BigInteger.valueOf(100000000);

    public Company() {
    }

    public void hire(Employee hire) {
        employees.add(hire);
    }

    public void hireAll(List<Employee>hireList) {
            employees.addAll(hireList);
    }

    public BigInteger getIncome() {
        return income;
    }

    public void setIncome(BigInteger income) {
        this.income = this.income.add(income);
    }

    public BigInteger getCompanyPlan() {
        return companyPlan;
    }

    public void fire(Employee employee) {
            employees.remove(employee);
    }

    public ArrayList<Employee> getEmployees(){
        return employees;
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
        Comparator<Employee> low = new EmployeeComparatorTop().reversed();
        employees.sort(low);
        ArrayList<Employee> lowSalary = new ArrayList<>();
        for (int q = 0; q < count; q++)
        {
            lowSalary.add(employees.get(q));
        }
        return lowSalary;
    }
}
