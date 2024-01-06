package com.company.delivery.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity(name="Address")

public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer addressId;

    @Column(nullable = false,unique = true)
    private String city;

    @Column(nullable = false,unique = true)
    private String street;
    @Column(nullable = false,unique = true)
    private short postal_code;

    @OneToMany(mappedBy = "customerAddress", cascade = CascadeType.ALL)
    private List<Customer> customers = new ArrayList<Customer>();

    @OneToMany(mappedBy = "deliveryGuyAddress", cascade = CascadeType.ALL)
    private List<DeliveryGuy> deliveryGuys = new ArrayList<DeliveryGuy>();

    @OneToMany(mappedBy = "headQuartersAddress", cascade = CascadeType.ALL)
    private List<Brand> heaQuartersAddresses = new ArrayList<Brand>();

    @OneToMany(mappedBy = "restaurantAddress", cascade = CascadeType.ALL)
    private List<Restaurant> restaurantAddresses = new ArrayList<Restaurant>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country")
    private Country country;

    public Integer getAddressId() {
        return addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public short getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(short postal_code) {
        this.postal_code = postal_code;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }



    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
