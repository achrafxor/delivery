package com.company.delivery.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name="Restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer restaurantId;
    @Column(nullable = false,unique = true)
    private String RestaurantName;
    @Column(nullable = false,unique = false)
    private String phoneNumber;
    @Column(nullable = true,unique = false)
    private String Description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address restaurantAddress;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private List<Menu> listOfMenus = new ArrayList<Menu>();

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private Set<FoodOrder> orderSet = new HashSet<>();


}
