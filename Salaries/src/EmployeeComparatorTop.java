import java.util.Comparator;

public class EmployeeComparatorTop implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
      if (o1.getMonthSalary().compareTo(o2.getMonthSalary()) > 0) return -1;
      if (o1.getMonthSalary().compareTo(o2.getMonthSalary()) < 0) return 1;
      else return 0;
    }
}
