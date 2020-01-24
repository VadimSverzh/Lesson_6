package Accounts;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class DepositAccount extends MainAccount {

    private LocalDateTime takeDate;

    public DepositAccount (String amount){
        super(amount);
    LocalDateTime openDate = LocalDateTime.now();
    takeDate = openDate.plusMonths(1);
    }

    @Override
    public void take(BigDecimal amount) {
        LocalDateTime currentDate = LocalDateTime.now();
        if (currentDate.isAfter(takeDate)) {
            super.take(amount);
        }
        else System.out.println("Вы не можете взять деньги, пока не пройдёт месяц!");
    }
}
