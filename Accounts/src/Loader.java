import Accounts.CardAccount;
import Accounts.DepositAccount;
import Accounts.MainAccount;

import java.math.BigDecimal;

public class Loader {

    public static void main(String[] args) {

<<<<<<< HEAD
        MainAccount account1 = new MainAccount("1000");
=======
        DepositAccount account1 = new DepositAccount("1000");
>>>>>>> a2cc0e95c4c1510f7546676916406a7383e09cd7
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
