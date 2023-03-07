package com.github.EzequielLutter.EldarChallenge.services;

import com.github.EzequielLutter.EldarChallenge.entities.Card;

import java.time.LocalDate;

public class CardService {

    public boolean iscardvalid(Card card){
        return card.isValid();
    }

    public boolean isNotCardValid(Card card){
        return card.isNotValid();
    }

}
