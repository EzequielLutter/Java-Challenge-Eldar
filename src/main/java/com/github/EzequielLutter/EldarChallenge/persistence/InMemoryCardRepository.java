package com.github.EzequielLutter.EldarChallenge.persistence;

import com.github.EzequielLutter.EldarChallenge.entities.Card;
import com.github.EzequielLutter.EldarChallenge.repositories.CardRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCardRepository implements CardRepository
{


    @Override
    public void save(Card card) {

    }

    @Override
    public void findById(Card card) {

    }

    //Crear una lista de tarjetas e implementar esos metodos

    List<Card> cards = new ArrayList<>();

}
