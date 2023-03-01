package com.github.EzequielLutter.EldarChallenge.entities;

import java.math.BigDecimal;

public class Operation {

    private BigDecimal amount;


    public Operation(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    private static final BigDecimal valueLimit = BigDecimal.valueOf(1000);
    public boolean isValid() {
        return amount.compareTo(valueLimit)<0;
    }
}
