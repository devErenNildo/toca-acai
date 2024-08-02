package com.toca_do_acai.domain.address;

import com.toca_do_acai.domain.user.User;
import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "address")
@Entity
public class Address {
    @Id
    @GeneratedValue
    private UUID id;

    private String phoneNumber;
    private String cep;
    private String street;
    private String neighborhood;
    private String city;
    private String state;
    private String houseNumber;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
