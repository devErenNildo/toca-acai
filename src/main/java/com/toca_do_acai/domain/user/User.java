package com.toca_do_acai.domain.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "userClient")
public class User {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String phoneNumber;
}
