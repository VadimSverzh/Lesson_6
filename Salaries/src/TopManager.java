public class TopManager implements Employee {

    private final double fix = 100000.;
    private final double percent = 150.;
    private final double companyPlan = 10000000.;

    public double getMonthSalary() {
            if (Company.getIncome() > companyPlan){
            return fix + (fix * percent);
            }
            else return fix;
    }
}
