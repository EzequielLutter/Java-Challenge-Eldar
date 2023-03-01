package com.github.EzequielLutter.EldarChallenge.services;

import com.github.EzequielLutter.EldarChallenge.entities.Operation;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OperationServiceTest {

    @Test
    public void operationIsValid(){
        //setup
        OperationService operationService = new OperationService();
        Operation operation = new Operation(BigDecimal.valueOf(999));
        Boolean isValid = operationService.isOperationValid(operation);
        //execute

        //verify
        assertTrue(isValid);
    }
    @Test
    public void operationIsNotValidBorderCase(){
        //setup
        OperationService operationService = new OperationService();
        Operation operation = new Operation(BigDecimal.valueOf(1000));
        //execute
        Boolean isValid = operationService.isOperationValid(operation);

        //verify
        assertFalse(isValid);
    }
}
