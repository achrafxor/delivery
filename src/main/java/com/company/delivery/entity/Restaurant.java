package com.company.delivery.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name="Restaurant")
@Table
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
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address restaurantAddress;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Menu> listOfMenus = new ArrayList<Menu>();

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<FoodOrder> orderSet = new HashSet<>();

    public Restaurant(String restaurantName, String phoneNumber, String description, Address restaurantAddress, Brand brand) {
        RestaurantName = restaurantName;
        this.phoneNumber = phoneNumber;
        Description = description;
        this.restaurantAddress = restaurantAddress;
        this.brand = brand;
        this.listOfMenus = new ArrayList<>();
        this.orderSet = new HashSet<>();
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }



    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        RestaurantName = restaurantName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Address getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(Address restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public List<Menu> getListOfMenus() {
        return listOfMenus;
    }

    public void setListOfMenus(List<Menu> listOfMenus) {
        this.listOfMenus = listOfMenus;
    }

    public Set<FoodOrder> getOrderSet() {
        return orderSet;
    }

    public void setOrderSet(Set<FoodOrder> orderSet) {
        this.orderSet = orderSet;
    }
}
