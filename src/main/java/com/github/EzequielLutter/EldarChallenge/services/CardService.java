package com.github.EzequielLutter.EldarChallenge.services;

import com.github.EzequielLutter.EldarChallenge.entities.Card;

import java.time.LocalDate;

public class CardService {

    public boolean iscardvalid(Card card){
        if (card.getDueDate().compareTo(LocalDate.now())>0){ //traigo la fecha actual con el local date y la comparo con el dueDate de la card
            return true;
        }

        return false;
    }

}
