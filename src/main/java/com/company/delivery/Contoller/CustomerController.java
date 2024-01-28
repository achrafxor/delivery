package com.company.delivery.Contoller;

import com.company.delivery.DTO.CustomerRequestDTO;
import com.company.delivery.DTO.CustomerResponseDTO;
import com.company.delivery.services.CustomerService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Customer")
@AllArgsConstructor
@Slf4j

public class CustomerController {
    private CustomerService customerService;


    @PostMapping("/add")
    public ResponseEntity<CustomerResponseDTO> createNewProduct(@RequestBody @Valid CustomerRequestDTO customerRequestDTO){
        CustomerResponseDTO customerResponseDTO=customerService.createNewCustomer(customerRequestDTO);
        return new ResponseEntity<>(customerResponseDTO, HttpStatus.CREATED);
    }
}
