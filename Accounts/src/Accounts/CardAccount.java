package Accounts;

public class CardAccount extends MainAccount {

    public CardAccount (double amount) {
        super (amount);
    }

    @Override
    public void take(double amount) {
        this.amount = this.amount - amount * 1.01;
    }
}
