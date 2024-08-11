package com.toca_acai.domain.address;

import com.toca_acai.domain.user.UserClient;
import jakarta.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10, nullable = false)
    private String postalCode;

    @Column(length = 100, nullable = false)
    private String city;

    @Column(length = 250, nullable = false)
    private String neighborhood;

    @Column(length = 250, nullable = false)
    private String road;

    @Column(length = 10, nullable = false)
    private String houseNumber;

    @Column(length = 255)
    private String complement;

    @ManyToOne
    @JoinColumn(name = "user_client_id", nullable = false)
    private UserClient userClient;

    //-------------------------------------------------------------------------------------------------
    // getter and setter
    //-------------------------------------------------------------------------------------------------
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public UserClient getUserClient() {
        return userClient;
    }

    public void setUserClient(UserClient userClient) {
        this.userClient = userClient;
    }
}
