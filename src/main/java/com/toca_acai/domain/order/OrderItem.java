package com.toca_acai.domain.order;

import com.toca_acai.domain.product.Product;
import jakarta.persistence.*;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Product product;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private int quantity;


    // constructors---------------------------------------------
    public OrderItem(){

    }

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.price = product.getPrice() * quantity;
        this.quantity = quantity;

    }

    // getters and setters---------------------------------------


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
