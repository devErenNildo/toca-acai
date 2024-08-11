package com.toca_acai.domain.user;

import com.toca_acai.domain.address.Address;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class UserClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 15)
    private String phoneNumber;

    @OneToMany(mappedBy = "userClient", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Address> addresses;

    public UserClient(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
