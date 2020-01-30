package Clients;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IndividualEntrepreneur extends  Client {

    private final double MAX_COMMISION = 0.01;
    private final double MIN_COMMISION = 0.005;
    private final double MAX_COMISSION_LIMIT = 1000.00;

    public IndividualEntrepreneur (String name, long accountNumber) {super (name, accountNumber);}

    public BigDecimal put (BigDecimal amount)
    {

        if (amount.compareTo(BigDecimal.valueOf(MAX_COMISSION_LIMIT)) < 0) {
            return super.put(amount.subtract(amount.multiply(BigDecimal.valueOf(MAX_COMMISION))).
                    setScale(2, RoundingMode.HALF_UP));}
        else {
            return super.put(amount.subtract(amount.multiply(BigDecimal.valueOf(MIN_COMMISION))).
                    setScale(2, RoundingMode.HALF_UP));}
    }
}
