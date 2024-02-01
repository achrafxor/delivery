package com.company.delivery.DTO;

import com.company.delivery.entity.CartExtra;
import com.company.delivery.utils.FoodExtra;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

public class ExtraRequestDTO {
    private FoodExtra item;
    private Short Price;
    private Set<CartExtra> CartExtras = new HashSet<>();
}
