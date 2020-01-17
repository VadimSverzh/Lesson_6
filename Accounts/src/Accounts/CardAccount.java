package Accounts;

import java.math.BigDecimal;

public class CardAccount extends MainAccount {

    public CardAccount (String amount) {
        super (amount);
    }

    @Override
    public void take(String amount) {
        BigDecimal thisAmount = new BigDecimal(this.amount);
        BigDecimal takeAmount = new BigDecimal(amount).multiply(BigDecimal.valueOf(1.01));
        this.amount = thisAmount.subtract(takeAmount).toString();
    }
}
