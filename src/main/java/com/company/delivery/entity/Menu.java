package com.company.delivery.entity;

import com.company.delivery.utils.FoodCategory;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name="Menu")
@Table
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer menuId;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false,unique = true)
    private FoodCategory foodCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Dish> listOfDishes = new ArrayList<Dish>();
}
