package com.github.EzequielLutter.EldarChallenge.persistence;

import com.github.EzequielLutter.EldarChallenge.entities.Card;
import com.github.EzequielLutter.EldarChallenge.repositories.CardRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryCardRepository implements CardRepository
{


    @Override
    public void save(Card card) {

        cards.put(card.getCardNumber(),card);
       /* Card cardFound = findById(card.getCardNumber());
        if (cardFound != null){
            return;
        }

        cards.add(card);*/
    }

    @Override
    public Card findById(String cardNumber) {

        return cards.get(cardNumber);


      /*  for (Card card:cards) {
            if (cardNumber.equals(card.getCardNumber())){
               return card;
            }
        }
        return null;*/
    }

    //Crear una lista de tarjetas e implementar esos metodos

    //List<Card> cards = new ArrayList<>();

Map<String,Card> cards=new HashMap<>();

}
