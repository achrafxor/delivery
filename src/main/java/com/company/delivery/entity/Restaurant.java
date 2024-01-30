package com.company.delivery.entity;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name="Restaurant")
@Table
@NoArgsConstructor
@Getter
@Setter
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",updatable = false,nullable = false)
    private Integer restaurantId;
    @Column(name = "restaurant_name",nullable = false)
    private String RestaurantName;
    @Column(name = "phone_number",nullable = false,unique = false)
    private String phoneNumber;
    @Column(nullable = true,unique = false)
    private String Description;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL  )
    @JoinColumn(name = "address_id")
    private Address restaurantAddress;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @OneToMany(mappedBy = "restaurant", cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    private List<MenuCategory> listOfMenuCategories = new ArrayList<MenuCategory>();

    @OneToMany(mappedBy = "restaurant", cascade = {CascadeType.REFRESH},fetch = FetchType.LAZY)
    private Set<FoodOrder> orderSet = new HashSet<>();

    public Restaurant(String restaurantName, String phoneNumber, String description, Address restaurantAddress, Brand brand) {
        RestaurantName = restaurantName;
        this.phoneNumber = phoneNumber;
        Description = description;
        this.restaurantAddress = restaurantAddress;
        this.brand = brand;
        this.listOfMenuCategories = new ArrayList<>();
        this.orderSet = new HashSet<>();
    }


}
