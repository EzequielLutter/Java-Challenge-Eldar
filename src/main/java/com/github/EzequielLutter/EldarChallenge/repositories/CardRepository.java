package com.github.EzequielLutter.EldarChallenge.repositories;

import com.github.EzequielLutter.EldarChallenge.entities.Card;

import java.util.List;

public interface CardRepository {

    void save(Card card);

    Card findById(String cardNumber);





}
