package com.company.delivery.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="CartExtra")
@Table
@Getter
@Setter
@NoArgsConstructor
public class CartExtra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cartExtraId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "food_order_id")
    private FoodOrder foodOrder;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "extra_id")
    private Extra extra;

    @Column(nullable = false,unique = false)
    private Short quantity;

    public CartExtra( FoodOrder foodOrder, Extra extra, Short quantity) {
        this.foodOrder = foodOrder;
        this.extra = extra;
        this.quantity = quantity;
    }
}
