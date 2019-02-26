package com.dbs.h2.demo.model;

import lombok.ToString;
import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Value
@ToString
public class RegisteredUser {
    @Id
    private String cin;
    private String firstName;
    private String lastName;
    private String middleName;
    private Long mobileNumber;
    private Long walletId;
    private String countryCode;
}
