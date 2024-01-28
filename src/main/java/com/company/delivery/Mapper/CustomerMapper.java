package com.company.delivery.Mapper;

import ch.qos.logback.core.model.ComponentModel;
import com.company.delivery.DTO.CustomerRequestDTO;
import com.company.delivery.DTO.CustomerResponseDTO;
import com.company.delivery.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper

public interface CustomerMapper {
    Customer requestDtoToEntity(CustomerRequestDTO customerRequestDTO);
    Customer responseDtoToEntity(CustomerResponseDTO customerResponseDTO);
    CustomerRequestDTO entityToRequestDto(Customer customer);
    CustomerResponseDTO
    entityToResponseDto(Customer customer);
}
