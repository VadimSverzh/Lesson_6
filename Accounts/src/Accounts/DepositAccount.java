package Accounts;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class DepositAccount extends MainAccount {

    private BigDecimal amount;
    private LocalDateTime takeDate;

    public DepositAccount (String amount){
        super(amount);
    LocalDateTime openDate = LocalDateTime.now();
    takeDate = openDate.plusMonths(1);
    }

    @Override
    public void take(BigDecimal amount) {
        LocalDateTime currentDate = LocalDateTime.now();
        BigDecimal takeAmount = amount;
        if (currentDate.isAfter(takeDate)) {
            super.take(takeAmount);
        }
        else System.out.println("Вы не можете взять деньги, пока не пройдёт месяц!");
    }
}
