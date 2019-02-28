package com.dbs.h2.demo.controller;

import com.dbs.h2.demo.model.Card;
import com.dbs.h2.demo.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {

    @Autowired
    private CardService cardService;

    @GetMapping(value = "/cards")
    List<Card> getAllCards() {
        return cardService.getAllCards();
    }

    @GetMapping(value = "/users/{userId}/cards")
    Page<Card> getAllCardsByUserId(@PathVariable(value = "userId") Long userId,
                                   Pageable pageable) {
        return cardService.getCardsByUserId(userId, pageable);
    }
}
