import Accounts.CardAccount;
import Accounts.DepositAccount;
import Accounts.MainAccount;

public class Loader {
    public static void main(String[] args) {
        CardAccount account1 = new CardAccount(1000);
        account1.put(300.5);
        account1.getAmount();
        MainAccount account = new MainAccount(100.1);
        account.getAmount();
        account.put(100.2);
        account.getAmount();
        account.take(100.1);
        account.getAmount();
        account1.take(10.5);
        account1.getAmount();
    }
}
