package com.company.delivery.Contoller;

import com.company.delivery.entity.Restaurant;
import com.company.delivery.services.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
@AllArgsConstructor
public class RestaurantController {
    private RestaurantService restaurantService;

    public ResponseEntity<List<Restaurant>> getAllRestaurants(){
        return new ResponseEntity<>(restaurantService.getAllrestaurants(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Restaurant> add(@RequestBody Restaurant restaurant){
        return  new ResponseEntity<>(restaurantService.addRestaurant(restaurant),HttpStatus.CREATED);
    }

}
