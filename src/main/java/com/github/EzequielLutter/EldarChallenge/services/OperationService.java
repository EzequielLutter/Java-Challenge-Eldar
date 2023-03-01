package com.github.EzequielLutter.EldarChallenge.services;


import com.github.EzequielLutter.EldarChallenge.entities.Operation;

import java.math.BigDecimal;

public class OperationService {

    public Boolean isOperationValid(Operation operation){
        if (operation.isValid()){
            return true;
        }

        return false;
    }
}
