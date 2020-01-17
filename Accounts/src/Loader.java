import Accounts.CardAccount;
import Accounts.DepositAccount;
import Accounts.MainAccount;

public class Loader {
    public static void main(String[] args) {
        DepositAccount account1 = new DepositAccount("1000");
        account1.take("300.5");
        account1.take("100.1");
        account1.take("200.951");
        account1.getAmount();
        account1.put("10.5");
        account1.getAmount();
        account1.put("1005");
        account1.getAmount();
    }
}
