package com.dbs.h2.demo.model;

import lombok.ToString;
import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Value
@ToString
public class Card {
    @Id
    @GeneratedValue
    private Long number;
    private String name;
    private int cvv;
    private String type;
}
