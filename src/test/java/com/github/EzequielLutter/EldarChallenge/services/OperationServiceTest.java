package com.github.EzequielLutter.EldarChallenge.services;

import com.github.EzequielLutter.EldarChallenge.entities.Operation;
import com.github.EzequielLutter.EldarChallenge.enums.CardBrand;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

public class OperationServiceTest {

    @Test
    public void operationIsValid(){
        //setup
        OperationService operationService = new OperationService(LocalDate.now());
        Operation operation = new Operation(BigDecimal.valueOf(999));
        Boolean isValid = operationService.isOperationValid(operation);
        //execute

        //verify
        assertTrue(isValid);
    }
    @Test
    public void operationIsNotValidBorderCase(){
        //setup
        OperationService operationService = new OperationService(LocalDate.now());
        Operation operation = new Operation(BigDecimal.valueOf(1000));
        //execute
        Boolean isValid = operationService.isOperationValid(operation);

        //verify
        assertFalse(isValid);
    }
@Test
    public void calculateInterestRate() {
        //setup

        CardBrand brand = CardBrand.VISA;

        LocalDate today = LocalDate.of(2023,Month.APRIL,21); //inyeccion de dependencia en operation serve-creando fecha fija

        OperationService operationService = new OperationService(today);

        //execute

    BigDecimal resultado = operationService.calculateInterestRate(brand);


    //verify

    assertEquals(resultado.doubleValue(), BigDecimal.valueOf(23/4).doubleValue()); //comparo el resultado con el valor de fecha de hoy
    }
    //Agregar caso de Test para NARA y AMEX
    //y para el caso de una tarjeta que no esta agregada en los casos
    //probar casos de test en los ejercicios de DDR
}
