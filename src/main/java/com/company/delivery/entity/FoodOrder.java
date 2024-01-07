package com.company.delivery.entity;

import com.company.delivery.utils.OrderStatusEnum;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity(name="FoodOrder")
@Table
public class FoodOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer foodOrderId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
    @Column(nullable = false,unique = false)
    private String orderTime;

    @Enumerated
    @Column(nullable = false,unique = false)
    private OrderStatusEnum orderStatus;

    @OneToMany(mappedBy = "foodOrder", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<CartDish> CartDishes = new HashSet<>();

    @OneToMany(mappedBy = "foodOrder", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<CartExtra> CartExtras = new HashSet<>();


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delivery_guy_id")
    private DeliveryGuy deliveryGuy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address foodOrderAddress;




}
