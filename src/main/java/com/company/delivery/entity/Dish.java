package com.company.delivery.entity;

import jakarta.persistence.*;

@Entity(name="Dish")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer dishId;
    @Column(nullable = false,unique = false)
    private String item;

    @Column(nullable = true,unique = false)
    private Boolean hasHarisa;

    @Column(nullable = true,unique = false)
    private Boolean hasMayonnaise;

    @Column(nullable = false,unique = false)
    private short basicPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id")
    private Menu menu;

}
