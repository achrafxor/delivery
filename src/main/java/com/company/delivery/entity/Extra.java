package com.company.delivery.entity;

import com.company.delivery.utils.FoodExtra;
import com.fasterxml.jackson.databind.annotation.EnumNaming;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name="Extra")
public class Extra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer dishId;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false,unique = false)
    private FoodExtra extra;

    @ManyToMany(mappedBy = "extras")
    private Set<Dish> dishes = new HashSet<>();


}
