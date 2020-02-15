import java.util.Collections;

public class Loader {
    public static void main(String[] args) {
        Company company = new Company(80,20,10);
        System.out.println(company.getIncome());
        System.out.println("Топ зарплат");
        System.out.println(company.getTopSalaryStaff(10));
        company.hire(Position.MANAGER);
    }
}
