package com.company.delivery.entity;

import com.company.delivery.utils.OrderStatusEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name="FoodOrder")
@Table
@NoArgsConstructor
@Getter
@Setter
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

    @OneToMany(mappedBy = "foodOrder", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH},fetch = FetchType.LAZY)
    private Set<CartDish> CartDishes = new HashSet<>();

    @OneToMany(mappedBy = "foodOrder", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH},fetch = FetchType.LAZY)
    private Set<CartExtra> CartExtras = new HashSet<>();


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delivery_guy_id")
    private DeliveryGuy deliveryGuy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address foodOrderAddress;

    public FoodOrder(Customer customer, Restaurant restaurant, String orderTime, OrderStatusEnum orderStatus, Set<CartDish> cartDishes, Set<CartExtra> cartExtras, DeliveryGuy deliveryGuy, Address foodOrderAddress) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.orderTime = orderTime;
        this.orderStatus = orderStatus;
        CartDishes = cartDishes;
        CartExtras = cartExtras;
        this.deliveryGuy = deliveryGuy;
        this.foodOrderAddress = foodOrderAddress;
    }
}
