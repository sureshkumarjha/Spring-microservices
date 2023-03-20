package com.microservices.service;

import com.microservices.model.Customer;
import com.microservices.model.CustomerRegistrationRequest;
import com.microservices.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public record CustomerService(CustomerRepository customerRepository) {

    public void registerCustomerService(CustomerRegistrationRequest customerRegistrationRequest){
        Customer customer = Customer.builder()
                .firstName(customerRegistrationRequest.firstName())
                .lastName(customerRegistrationRequest.lastName())
                .address(customerRegistrationRequest.address())
                .email(customerRegistrationRequest.email())
                .build();
        log.info("Customer : {}",customer);

        customerRepository.save(customer);
    }
}
