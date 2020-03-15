public class Loader {
    public static void main(String[] args) {
        Company company = new Company(180,80,10);
        System.out.printf("%,d руб.%n", company.getIncome());

        Company company2 = new Company(180, 80, 10);
        System.out.printf("%,d руб.%n", company2.getIncome());

        System.out.println("Рейтинг высоких зарплат");
        for (Employee top: company.getTopSalaryStaff(15))
        {
            System.out.printf((company.getTopSalaryStaff(15).indexOf(top) + 1) + ". " + "%,d руб.%n", top.getMonthSalary());
        }

        System.out.println("Рейтинг низких зарплат");
        for (Employee low: company.getLowSalaryStaff(30))
        {
            System.out.printf((company.getLowSalaryStaff(30).indexOf(low) + 1) + ". " + "%,d руб.%n", low.getMonthSalary());
        }

        company.fire(135);

        System.out.println("После увольнения осталось " + company.getEmployeeAmount() + " сотрудников");

        System.out.println("Рейтинг высоких зарплат после увольнений");
        for (Employee top: company.getTopSalaryStaff(15))
        {
            System.out.printf((company.getTopSalaryStaff(15).indexOf(top) + 1) + ". " + "%,d руб.%n", top.getMonthSalary());
        }

        System.out.println("Рейтинг низких зарплат после увольнений");
        for (Employee low: company.getLowSalaryStaff(30))
        {
            System.out.printf((company.getLowSalaryStaff(30).indexOf(low) + 1) + ". " + "%,d руб.%n", low.getMonthSalary());
        }
    }
}
