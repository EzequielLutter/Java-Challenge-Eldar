package com.github.EzequielLutter.EldarChallenge.entities;

import java.time.LocalDate;

//Esto va a ser una entidad de dominio
public class Card {

    private String brand;
    private String cardNumber;
    private String cardHolder;
    private LocalDate dueDate;

    public Card(String brand, String cardNumber, String cardHolder, LocalDate dueDate) {
        this.brand = brand;
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.dueDate = dueDate;

    }

    public String getBrand() {
        return brand;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
}
