package com.dbs.h2.demo.controller;

import com.dbs.h2.demo.model.Card;
import com.dbs.h2.demo.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
