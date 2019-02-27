package com.dbs.h2.demo.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
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
