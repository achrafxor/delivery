package com.company.delivery.DTO;

import com.company.delivery.entity.Address;
import com.company.delivery.entity.FoodOrder;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class DeliveryGuyRequestDTO {
    private String firstNameName;
    private String lastName;
    private String Number;
    private String userName;
    private String eMail;
    private Address deliveryGuyAddress;
}
