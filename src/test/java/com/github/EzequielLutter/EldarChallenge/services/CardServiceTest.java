package com.github.EzequielLutter.EldarChallenge.services;

import com.github.EzequielLutter.EldarChallenge.entities.Card;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CardServiceTest {

    @Test
    public void cardIsValid() {
        //setup- creo y defino variables que voy a utilizar para el test-herramientas que voy a utilizar
        String brand= "VISA";
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

}
