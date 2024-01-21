package com.company.delivery.entity;

import com.company.delivery.utils.Nationality;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity(name="Brand")
@Table
@Getter
@Setter
@NoArgsConstructor
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer brandId;

    @Column(nullable = false, unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Nationality Nationality;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "head_quarter_address")
    private Address headQuartersAddress;

    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL)
    private List<Restaurant> listOfRestaurants = new ArrayList<Restaurant>();

    public Brand(String name, com.company.delivery.utils.Nationality nationality, Address headQuartersAddress) {
        this.name = name;
        Nationality = nationality;
        this.headQuartersAddress = headQuartersAddress;
        this.listOfRestaurants = new ArrayList<>();
    }


}


