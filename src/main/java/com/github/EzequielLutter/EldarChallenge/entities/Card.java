package com.github.EzequielLutter.EldarChallenge.entities;

import com.github.EzequielLutter.EldarChallenge.enums.CardBrand;

import java.time.LocalDate;

//Esto va a ser una entidad de dominio
public class Card {

    private CardBrand brand;
    private String cardNumber;//Id
    private String cardHolder;
    private LocalDate dueDate;

    public Card(CardBrand brand, String cardNumber, String cardHolder, LocalDate dueDate) {
        this.brand = brand;
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.dueDate = dueDate;

    }

    public CardBrand getBrand() {
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

    public boolean isValid(LocalDate now) {
       return dueDate.compareTo(now)>=0;//traigo la fecha actual con el local date y la comparo con el dueDate de la card
    }

    public boolean isNotValid(LocalDate now){
        return dueDate.compareTo(now)<0;
    }
}
