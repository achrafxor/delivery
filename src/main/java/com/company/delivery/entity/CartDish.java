package com.company.delivery.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="CartDish")
@Table
@Getter
@Setter
@NoArgsConstructor
public class CartDish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cartDishId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "food_order_id")
    private FoodOrder foodOrder;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "dish_id")
    private Dish dish;

    @Column(nullable = false,unique = false)
    private Short quantity;

    public CartDish( FoodOrder foodOrder, Dish dish, Short quantity) {
        this.cartDishId = cartDishId;
        this.foodOrder = foodOrder;
        this.dish = dish;
        this.quantity = quantity;
    }
}
