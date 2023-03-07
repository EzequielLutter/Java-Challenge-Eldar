package com.github.EzequielLutter.EldarChallenge.services;


import com.github.EzequielLutter.EldarChallenge.entities.Operation;
import com.github.EzequielLutter.EldarChallenge.enums.CardBrand;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OperationService {

    public Boolean isOperationValid(Operation operation){
        if (operation.isValid()){
            return true;
        }

        return false;
    }

    public BigDecimal calculateInterestRate(CardBrand brand){
        switch (brand){
            case VISA:
                return calculateinterestRateForVisa();
            case AMEX:
            case NARA:
            default:
                throw new RuntimeException();
        }




    }

    private BigDecimal calculateinterestRateForVisa() {
        double rate = (today.getYear()-2000) / today.getMonth().getValue();
        return BigDecimal.valueOf(rate);
    }

    private LocalDate today;

    public OperationService(LocalDate today) {
        this.today = today;
    }
}
