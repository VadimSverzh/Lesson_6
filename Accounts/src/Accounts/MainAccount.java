package Accounts;

import java.math.BigDecimal;

public class MainAccount {

    public String amount;
    String sumCheck = "[\\d]+.?[\\d]{0,2}";

    public MainAccount (String amount) {
       if (amount.matches(sumCheck)) {
           this.amount = (new BigDecimal(amount)).toString();
       }
       else System.out.println("Сумма введена с ошибкой!");
    }

    public void put (String amount){
        if (amount.matches(sumCheck)) {
            BigDecimal thisAmount = new BigDecimal(this.amount);
            BigDecimal putAmount = new BigDecimal(amount);
            this.amount = (thisAmount.add(putAmount)).toString();
        }
        else System.out.println("Сумма введена с ошибкой!");
    }

    public void take (String amount){
        if (amount.matches(sumCheck)) {
            BigDecimal thisAmount = new BigDecimal(this.amount);
            BigDecimal takeAmount = new BigDecimal(amount);
            if (thisAmount.compareTo(takeAmount) > 0) {
                this.amount = thisAmount.subtract(takeAmount).toString();
            } else System.out.println("Запрашиваемая сумма превышает размер денежных средств на счёте!");
        }
        else System.out.println("Сумма введена с ошибкой!");
    }

    public void getAmount(){
        System.out.print("Сумма на счёте: " + amount + " руб." + "\n");
    }
}
