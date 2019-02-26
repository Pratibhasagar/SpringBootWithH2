package com.dbs.h2.demo.controller;

import com.dbs.h2.demo.model.Card;
import com.dbs.h2.demo.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    @Autowired
    private CardService cardService;

    @GetMapping(value = "/cards")
    @ResponseBody
    Card getAllCards() {
        Card card = new Card(1L, "Test", 111, "POSB");

        return card;
    }
}
