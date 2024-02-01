package com.company.delivery.DTO;

import com.company.delivery.entity.Dish;
import com.company.delivery.entity.Restaurant;
import com.company.delivery.utils.FoodCategory;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class MenuCategoryRequestDTO {

    private FoodCategory foodCategory;

    private Restaurant restaurant;

    private List<Dish> listOfDishes = new ArrayList<Dish>();
}
