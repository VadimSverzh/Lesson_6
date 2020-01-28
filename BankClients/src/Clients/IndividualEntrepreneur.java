package Clients;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IndividualEntrepreneur extends  Client {
    public IndividualEntrepreneur (String name, long accountNumber) {super (name, accountNumber);}

    public BigDecimal put (BigDecimal amount)
    {
        if (amount.compareTo(BigDecimal.valueOf(1000)) < 0) {
            return super.put(amount.subtract(amount.multiply(BigDecimal.valueOf(0.01))).setScale(2, RoundingMode.HALF_UP));}
        else {
            return super.put(amount.subtract(amount.multiply(BigDecimal.valueOf(0.005))).setScale(2, RoundingMode.HALF_UP));}
    }
}
