package Accounts;

import java.time.LocalDateTime;

public class DepositAccount extends MainAccount {

    private LocalDateTime takeDate;

    public DepositAccount (double amount){
        super(amount);
    LocalDateTime openDate = LocalDateTime.now();
    takeDate = openDate.plusMonths(1);
    }

    @Override
    public void take(double amount) {
        LocalDateTime currentDate = LocalDateTime.now();
        if (currentDate.isAfter(takeDate)) {
            this.amount = this.amount - amount;
        }
        else System.out.println("Вы не можете взять деньги, пока не пройдёт месяц!");
    }
}
