package Clients;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Legal extends Client{

    public Legal (String name, long accountNumber) {super(name, accountNumber);}

    @Override
    public BigDecimal take(BigDecimal amount)
    {
        return super.take(amount.add(amount.multiply(BigDecimal.valueOf(0.01)).setScale(2, RoundingMode.HALF_UP)));
    }
}
