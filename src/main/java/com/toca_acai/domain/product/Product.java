package com.toca_acai.domain.product;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // tamanho do copo
    @Column(nullable = false)
    private int cupSize;

    //quantidade de complementos que acompanha um copo
    @Column(nullable = false)
    private int amountsOfComplements;

    // preco do copo
    @Column(nullable = false)
    private double price;

    // constructor-----------------------------------------------------------
    public Product(){
    }

    public Product(int cupSize, int amountsOfComplements) {
        this.cupSize = cupSize;
        this.amountsOfComplements = amountsOfComplements;
    }

    // getters and setters----------------------------------------------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCupSize() {
        return cupSize;
    }

    public void setCupSize(int cupSize) {
        this.cupSize = cupSize;
    }

    public int getAmountsOfComplements() {
        return amountsOfComplements;
    }

    public void setAmountsOfComplements(int amountsOfComplements) {
        this.amountsOfComplements = amountsOfComplements;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
