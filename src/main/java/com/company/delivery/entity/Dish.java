package com.company.delivery.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name="Dish")
@Table
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @OneToMany(mappedBy = "dish", cascade = CascadeType.ALL)
    private Set<CartDish> CartDishes = new HashSet<>();


}
