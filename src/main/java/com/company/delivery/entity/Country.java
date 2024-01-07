package com.company.delivery.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name="Country")
@Table
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer countryId; //integer is too long datatype for country id
    @Column(nullable = false,unique = true)
    private String countryName;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<Address> addresses = new ArrayList<Address>();

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public Integer getCountryId() {
        return countryId;
    }



    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
