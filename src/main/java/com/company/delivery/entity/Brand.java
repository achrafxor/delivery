package com.company.delivery.entity;

import com.company.delivery.utils.Nationality;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name="Brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer brandId;

    @Column(nullable = false, unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Nationality Nationality;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "head_quarter_address")
    private Address headQuartersAddress;

    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL)
    private List<Restaurant> listOfRestaurants = new ArrayList<Restaurant>();
    public Integer getBrandId() {
        return brandId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public com.company.delivery.utils.Nationality getNationality() {
        return Nationality;
    }

    public void setNationality(com.company.delivery.utils.Nationality nationality) {
        Nationality = nationality;
    }
}


