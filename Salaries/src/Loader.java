import employee.Employee;
import employee.Operator;
import employee.Manager;
import employee.TopManager;

import company.Company;

import java.util.ArrayList;
import java.util.List;

public class Loader {
    public static void main(String[] args) {
        Company company = new Company();

        List<Employee> toHireCompany = new ArrayList<>();

        for (int i = 0; i < 180; i++) {
            toHireCompany.add(new Operator(company));
        }

        for (int i = 0; i < 80; i++) {
            toHireCompany.add(new Manager(company));
        }

        for (int i = 0; i < 10; i++) {
            toHireCompany.add(new TopManager(company));
        }

        company.hireAll(toHireCompany);

        System.out.println("В компанию нанято " + company.getEmployees().size() + " сотрудников");
        System.out.println();

        System.out.printf("Доход компании %,d руб.%n", company.getIncome());
        System.out.println();

        System.out.println("Рейтинг высоких зарплат");
        for (Employee top: company.getTopSalaryStaff(15))
        {
            System.out.printf((company.getTopSalaryStaff(15).indexOf(top) + 1) + ". " + "%,d руб.%n", top.getMonthSalary());
        }
        System.out.println();

        System.out.println("Рейтинг низких зарплат");
        for (Employee low: company.getLowSalaryStaff(30))
        {
            System.out.printf((company.getLowSalaryStaff(30).indexOf(low) + 1) + ". " + "%,d руб.%n", low.getMonthSalary());
        }

        for (int j = 0; j < company.getEmployees().size(); j++){
            company.fire(j, Operator.class,90);
            company.fire(j, Manager.class, 40);
            company.fire(j, TopManager.class,5);
        }

        System.out.println();
        System.out.println("После увольнения осталось " + company.getEmployees().size() + " сотрудников");
        System.out.println();

        System.out.println("Рейтинг высоких зарплат после увольнений");
        for (Employee top: company.getTopSalaryStaff(15))
        {
            System.out.printf((company.getTopSalaryStaff(15).indexOf(top) + 1) + ". " + "%,d руб.%n", top.getMonthSalary());
        }

        System.out.println();
        System.out.println("Рейтинг низких зарплат после увольнений");
        for (Employee low: company.getLowSalaryStaff(30))
        {
            System.out.printf((company.getLowSalaryStaff(30).indexOf(low) + 1) + ". " + "%,d руб.%n", low.getMonthSalary());
        }
    }
}
