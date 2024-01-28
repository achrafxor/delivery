package com.company.delivery.services;

import com.company.delivery.DTO.CustomerRequestDTO;
import com.company.delivery.DTO.CustomerResponseDTO;

import java.util.List;

public interface CustomerService {
    public CustomerResponseDTO createNewCustomer(CustomerRequestDTO customerRequestDTO);
    public List<CustomerResponseDTO> getAllCustomers();
    public CustomerResponseDTO getCustomerById(long productId);
}
