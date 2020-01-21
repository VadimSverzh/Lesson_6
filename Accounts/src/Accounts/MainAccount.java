package Accounts;

import java.math.BigDecimal;

public class MainAccount {

    private BigDecimal amount;
    public final static String sumCheck = "[\\d]+.?[\\d]{0,2}";

    public MainAccount (String amount) {
           if (amount.matches(sumCheck)) {
               this.amount = new BigDecimal(amount);
           }
           else System.out.println("Сумма введена с ошибкой");
    }

    public void put (BigDecimal amount){
            this.amount = this.amount.add(amount);
    }

    public void take (BigDecimal amount){
            if (this.amount.compareTo(amount) >= 0) {
            this.amount = this.amount.subtract(amount);
            } else System.out.println("Запрашиваемая сумма превышает размер денежных средств на счёте!");
    }

    public void getAmount(){
        System.out.print("Сумма на счёте: " + amount + " руб." + "\n");
    }
}
