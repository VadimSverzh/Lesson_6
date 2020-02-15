import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {

    private ArrayList<Employee> employees = new ArrayList<>();
    private static final double min = 100000.;
    private static final double max = 20000000.;
    private int employeeAmount;

    public Company(int operators, int managers, int topManagers) {
        hireAll(operators, managers, topManagers);
        employeeAmount = operators + managers + topManagers;
    }

    public void hire(Position position) {
        if (position == Position.OPERATOR) employees.add(new Operator());
        else if (position == Position.MANAGER) employees.add(new Manager());
        else employees.add(new TopManager());
        employeeAmount = employeeAmount++;
    }

    public void hireAll(int operators, int managers, int topManagers) {

        for (int i = 1; i <= operators; i++) {
            employees.add(new Operator());
        }

        for (int j = 1; j <= managers; j++) {
            employees.add(new Manager());
        }

        for (int k = 1; k <= topManagers; k++) {
            employees.add(new TopManager());
        }
        employeeAmount = employeeAmount + operators + managers + topManagers;
    }

    public static double getIncome() {
        return rnd(min, max);
    }

    public void fire(int count) {
        if (count <= employees.size()) {
            for (int o = 1; o <= count; o++)
            employees.remove(o);
        }
        else System.out.println("Введенноё количество превышает количество сотрудников компании!");
    }

    public static double rnd(double min, double max) {
        max -= min;
        return (Math.random() * ++max) + min;
    }

    public List<Employee> getTopSalaryStaff (int count){
        ArrayList<Employee>topSalary = new ArrayList<>();
        Comparator<Employee> top = new EmployeeComparator();
        employees.sort(top);
        for (int q = 1; q <= count; q++)
        {
         topSalary.add(employees.get(q));
            System.out.println(employees.get(q).getMonthSalary());
        }
        topSalary.sort(top);
        return topSalary;
    }
}
