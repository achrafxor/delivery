package com.company.delivery.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Entity(name="Address")
@Table
@Getter
@Setter
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;

    @Column(nullable = false,unique = true)
    private String street;
    @Column(nullable = false,unique = true)
    private short postal_code;

    @OneToMany(mappedBy = "customerAddress", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Customer> customers = new ArrayList<Customer>();

    @OneToMany(mappedBy = "deliveryGuyAddress", cascade = CascadeType.ALL)
    private List<DeliveryGuy> deliveryGuys = new ArrayList<DeliveryGuy>();

    @OneToMany(mappedBy = "headQuartersAddress", cascade = CascadeType.ALL)
    private List<Brand> heaQuartersAddresses = new ArrayList<Brand>();

    @OneToMany(mappedBy = "restaurantAddress", cascade = CascadeType.ALL)
    private List<Restaurant> restaurantAddresses = new ArrayList<Restaurant>();

    @OneToMany(mappedBy = "foodOrderAddress", cascade = CascadeType.ALL)
    private List<FoodOrder> foodOrderAddresses = new ArrayList<FoodOrder>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city")
    private City city;

    public Address(City city, String street, short postal_code) {
        this.city = city;
        this.street = street;
        this.postal_code = postal_code;
        this.city = city;
        this.customers=new ArrayList<>();
        this.deliveryGuys=new ArrayList<>();
        this.heaQuartersAddresses=new ArrayList<>();
        this.restaurantAddresses=new ArrayList<>();
        this.foodOrderAddresses=new ArrayList<>();
    }


}
