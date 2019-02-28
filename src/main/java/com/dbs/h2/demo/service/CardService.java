package com.dbs.h2.demo.service;

import com.dbs.h2.demo.model.Card;
import com.dbs.h2.demo.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    public List<Card> getAllCards() {
        List<Card> cardList = new ArrayList<>();
        cardList.addAll(cardRepository.findAll());
        return cardList;
    }

    public Page<Card> getCardsByUserId(Long userId, Pageable pageable) {
        return cardRepository.findByUserId(userId, pageable);
    }
}
