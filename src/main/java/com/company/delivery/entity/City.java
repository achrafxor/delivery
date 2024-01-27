package com.company.delivery.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity(name="CITY")
@Table
@Getter
@Setter
@NoArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cityId; //integer is too long datatype for country id

    @Column(nullable = false,unique = true)
    private String cityName;
    @OneToMany(mappedBy = "city", cascade = {CascadeType.ALL})
    private List<Address> addresses  = new ArrayList<Address>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country")
    private Country country;

    public City(String cityName, List<Address> addresses) {
        this.cityName = cityName;
        this.addresses = addresses;
    }

    public City(String cityName) {
        this.cityName = cityName;

    }

    public City(String cityName,Country country) {
        this.cityName = cityName;
        this.country=country;

    }
}
