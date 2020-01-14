package Accounts;

public class MainAccount {

    public double amount;

    public MainAccount (double amount) {
        this.amount = amount;
    }

    public void put (double amount){
        this.amount = this.amount + amount;
    }

    public void take (double amount){
        if (amount <= this.amount){
        this.amount = this.amount - amount;
        }
        else System.out.println("Запрашиваемая сумма превышает размер денежных средств на счёте!");
    }

    public void getAmount(){
        System.out.print("Сумма на счёте: " + amount + " руб." + "\n");
    }
}
