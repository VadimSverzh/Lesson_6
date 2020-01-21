import Accounts.CardAccount;
import Accounts.DepositAccount;
import Accounts.MainAccount;

import java.math.BigDecimal;

public class Loader {

    public static void main(String[] args) {

        CardAccount account1 = new CardAccount("1000");
        BigDecimal sum1 = new BigDecimal("1000");
        account1.take(sum1);

        account1.getAmount();

        BigDecimal sum2 = new BigDecimal("100.5");
        account1.take(sum2);

        account1.getAmount();

        BigDecimal sum3 = new BigDecimal("100.1");
        account1.put(sum3);

        account1.getAmount();

        BigDecimal sum4 = new BigDecimal("3000.1");
        account1.put(sum4);

        account1.getAmount();
    }
}
