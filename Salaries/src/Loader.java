public class Loader {
    public static void main(String[] args) {
        Company company = new Company(180,80,10);
        System.out.println(company.getIncome());

        System.out.println("Рейтинг высоких зарплат");
        for (Employee top: company.getTopSalaryStaff(300))
        {
        System.out.println(top.getMonthSalary());
        }

        System.out.println("Рейтинг низких зарплат");
        for (Employee low: company.getLowSalaryStaff(30))
        {
            System.out.println(low.getMonthSalary());
        }

        company.fire(135);

        System.out.println(company.getEmployeeAmount());

        System.out.println("Рейтинг высоких зарплат после увольнений");
        for (Employee top: company.getTopSalaryStaff(30))
        {
            System.out.println(top.getMonthSalary());
        }

        System.out.println("Рейтинг низких зарплат после увольнений");
        for (Employee low: company.getLowSalaryStaff(30))
        {
            System.out.println(low.getMonthSalary());
        }

//        company.hire(Position.MANAGER);
    }
}
