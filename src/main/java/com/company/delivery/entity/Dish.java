package com.company.delivery.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(
            name = "dish_extras",
            joinColumns = @JoinColumn(name = "dish_id"),
            inverseJoinColumns = @JoinColumn(name = "extra_id")
    )
    Set<Extra> extras = new HashSet<>();

}
