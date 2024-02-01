package com.company.delivery.DTO;

import com.company.delivery.entity.CartDish;
import com.company.delivery.entity.MenuCategory;

import java.util.HashSet;
import java.util.Set;

public class DishResponseDTO {
    private String item;
    private Boolean hasHarisa;
    private Boolean hasMayonnaise;
    private short basicPrice;
    private MenuCategory menuCategory;
    private Set<CartDish> CartDishes = new HashSet<>();
}
