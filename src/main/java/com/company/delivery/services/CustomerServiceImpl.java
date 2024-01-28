package com.company.delivery.services;

import com.company.delivery.DTO.CustomerRequestDTO;
import com.company.delivery.DTO.CustomerResponseDTO;
import com.company.delivery.Mapper.CustomerMapper;
import com.company.delivery.entity.Customer;
import com.company.delivery.repository.CustomerRepostiry;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
@Slf4j

public class CustomerServiceImpl implements CustomerService{
    private CustomerRepostiry customerRepostiry;
    private CustomerMapper customerMapper;
    @Override
    public CustomerResponseDTO createNewCustomer(CustomerRequestDTO customerRequestDTO) {
        CustomerResponseDTO customerResponseDTO=new CustomerResponseDTO();
        try {
            log.info("Customer service:createNewCustomer execution started.");
            Customer customer= customerMapper.requestDtoToEntity(customerRequestDTO);
            Customer customerResult=customerRepostiry.save(customer);
            customerResponseDTO=customerMapper.entityToResponseDto(customerResult);
        }catch (Exception ex){
            log.error("Exception occurred while persisting product to database , Exception message {}", ex.getMessage());

        }
        return customerResponseDTO;
    }

    @Override
    public List<CustomerResponseDTO> getAllCustomers() {
        return null;
    }

    @Override
    public CustomerResponseDTO getCustomerById(long productId) {
        return null;
    }
}
