package com.company.delivery.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name="Dish")
@Table
@Getter
@Setter
@NoArgsConstructor
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
    private MenuCategory menuCategory;

    @OneToMany(mappedBy = "dish", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    private Set<CartDish> CartDishes = new HashSet<>();

    public Dish(String item, Boolean hasHarisa, Boolean hasMayonnaise, short basicPrice, MenuCategory menuCategory, Set<CartDish> cartDishes) {

        this.item = item;
        this.hasHarisa = hasHarisa;
        this.hasMayonnaise = hasMayonnaise;
        this.basicPrice = basicPrice;
        this.menuCategory = menuCategory;
        CartDishes = cartDishes;
    }
}
