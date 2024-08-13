package com.toca_acai.domain.order;

import com.toca_acai.domain.address.Address;
import com.toca_acai.domain.user.UserClient;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // quem fez o pedido
    @ManyToOne
    @JoinColumn(name = "user_client_id", nullable = false)
    private UserClient userClient;

    // endereco do cliente
    @ManyToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    // itens do pedido
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderItem> items;

    //data do pedido
    @Column(nullable = false)
    private LocalDateTime orderData;

    //status do pedido
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
