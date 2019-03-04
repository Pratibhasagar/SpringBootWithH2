package com.dbs.h2.demo.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class User {
    @Id
    private String cin;
    private String firstName;
    private String lastName;
    private String middleName;
    private Long mobileNumber;
    private Long walletId;
    private String countryCode;
}
