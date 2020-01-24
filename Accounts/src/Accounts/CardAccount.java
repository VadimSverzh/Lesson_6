package Accounts;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CardAccount extends MainAccount {

    public CardAccount (String amount) {
        super (amount);
    }

    @Override
    public void take(BigDecimal amount) {
        BigDecimal takeAmount = amount.multiply(BigDecimal.valueOf(1.01)).setScale(2, RoundingMode.CEILING);
        super.take(takeAmount);
    }
}
