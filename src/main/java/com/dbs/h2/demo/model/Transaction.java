package com.dbs.h2.demo.model;

import lombok.ToString;
import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Value
@ToString
public class Transaction {
    @Id
    @GeneratedValue
    private Long id;
    private String timestamp;
    private long amount;
    private int status;
    private String category;
    private String subCategory;
}
