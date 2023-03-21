package com.github.EzequielLutter.EldarChallenge.repositories;

import com.github.EzequielLutter.EldarChallenge.entities.Card;

public interface CardRepository {

    void save(Card card);

    void findById(Card card);


}
