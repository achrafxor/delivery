package com.company.delivery.entity;

import jakarta.persistence.*;

@Entity(name="Restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
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
}
