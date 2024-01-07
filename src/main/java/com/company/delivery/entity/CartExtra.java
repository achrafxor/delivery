package com.company.delivery.entity;

import jakarta.persistence.*;

@Entity(name="CartExtra")
public class CartExtra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cartExtraId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "food_order_id")
    private FoodOrder foodOrder;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "extra_id")
    private Extra extra;


}
