package Clients;

import java.math.BigDecimal;

 public abstract class Client {
    private BigDecimal amount;
    private final String sumCheck = "[\\d]+(.[\\d]{2})?";

    Client(String name, long accountNumber) {
        this.amount = new BigDecimal("0");
    }

    public BigDecimal put(BigDecimal amount) {
            if (amount.toString().matches(sumCheck)) {
                this.amount = this.amount.add(amount);
                return this.amount;
            } else {
                System.out.println("Сумма введена с ошибкой!");
                return this.amount = this.amount.add(BigDecimal.valueOf(0));
            }
    }

    public BigDecimal take (BigDecimal amount) {
            if (amount.toString().matches(sumCheck) && (amount.compareTo(this.amount)) <= 0) {
                this.amount = this.amount.subtract(amount);
                return this.amount;
            }
            else {
                System.out.println("Сумма введена с ошибкой!");
                return this.amount = this.amount.subtract(BigDecimal. valueOf(0));
            }
        }

    public void balance () {
            System.out.println("Текущий баланс средств на счёте: " + this.amount + " руб.");
        }
    }