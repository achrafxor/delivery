package com.company.delivery.entity;

import jakarta.persistence.*;

@Entity(name="CartDish")
public class CartDish {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cartDishId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "food_order_id")
    private FoodOrder foodOrder;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "dish_id")
    private Dish dish;

    @Column(nullable = false,unique = false)
    private Short quantity;

}
