package Clients;

import java.math.BigDecimal;

 public abstract class Client {

    private BigDecimal amount;

    Client(String name, long accountNumber) {
        this.amount = new BigDecimal("0");
    }

    public BigDecimal put(BigDecimal amount) {
                this.amount = this.amount.add(amount);
                return this.amount;
            }

    public BigDecimal take (BigDecimal amount) {
            if (amount.compareTo(this.amount) <= 0) {
                this.amount = this.amount.subtract(amount);
                return this.amount;
            }
            else {
                System.out.println("Сумма превышает сумму на счёте!");
                return this.amount = this.amount.subtract(BigDecimal. valueOf(0));
            }
        }

    public void balance () {
            System.out.println("Текущий баланс средств на счёте: " + this.amount + " руб.");
        }
    }