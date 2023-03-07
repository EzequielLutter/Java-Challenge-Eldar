package com.github.EzequielLutter.EldarChallenge.services;

import com.github.EzequielLutter.EldarChallenge.entities.Card;
import com.github.EzequielLutter.EldarChallenge.enums.CardBrand;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CardServiceTest {

    @Test
    public void cardIsValid() {
        //setup- creo y defino variables que voy a utilizar para el test-herramientas que voy a utilizar
        CardBrand brand= CardBrand.VISA;
        String cardNumber= "2340 4560 6780 1235";
        String cardHolder= "Gino Luraschi";
        LocalDate dueDate= LocalDate.of(2025, Month.AUGUST, 30);

        CardService cardService = new CardService();

        Card card = new Card(brand, cardNumber, cardHolder, dueDate);

        //execute-
        boolean isvalid = cardService.iscardvalid(card);


        //verify

        assertTrue(isvalid);

    }
      //CREAR TEST EN QUE LA TARJETA NO SEA VALIDA!!!!
      //PASAR EL BRAND DE UNA VARIABLE STRING A UN ENUM.
    @Test
    public void cardIsNotValid(){
        //setup
        CardBrand brand= CardBrand.AMEX;
        String cardNumber= "3456 6545 7896 2345";
        String cardHolder= "Ezequiel Lutter";
        LocalDate dueDate= LocalDate.of(1987,Month.AUGUST, 27);

        CardService cardService= new CardService();

        Card card = new Card(brand, cardNumber, cardHolder, dueDate);

        //execute

        boolean isNotValid = cardService.isNotCardValid(card);

        //verify


        assertTrue(isNotValid);
    }
}
