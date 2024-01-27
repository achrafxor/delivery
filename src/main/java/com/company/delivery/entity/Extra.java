package com.company.delivery.entity;

import com.company.delivery.utils.FoodExtra;
import com.fasterxml.jackson.databind.annotation.EnumNaming;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name="Extra")
@Table
@Getter
@NoArgsConstructor
public class Extra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer extraId;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false,unique = false)
    private FoodExtra item;

    @Column(nullable = false,unique = false)
    private Short Price;

    @OneToMany(mappedBy = "extra", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    private Set<CartExtra> CartExtras = new HashSet<>();

    public Extra(FoodExtra item, Short price, Set<CartExtra> cartExtras) {
        this.item = item;
        Price = price;
        CartExtras = cartExtras;
    }
}
