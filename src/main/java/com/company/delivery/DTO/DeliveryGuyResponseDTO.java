package com.company.delivery.DTO;

import com.company.delivery.entity.Address;
import com.company.delivery.entity.FoodOrder;

import java.util.ArrayList;
import java.util.List;

public class DeliveryGuyResponseDTO {
    private Integer deliveryGuyId;
    private String firstNameName;
    private String lastName;
    private String Number;
    private String userName;
    private String eMail;
    private Address deliveryGuyAddress;
    private List<FoodOrder> foodOrders = new ArrayList<FoodOrder>();
}
