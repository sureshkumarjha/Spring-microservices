package com.microservices.controller;

import com.microservices.model.CustomerRegistrationRequest;
import com.microservices.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(path = "/api/v1/customer")
public record CustomerController(CustomerService customerService) {

    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest){
        log.info("incoming customer registration {}",customerRegistrationRequest.toString());
        customerService.registerCustomerService(customerRegistrationRequest);
    }

    @GetMapping("/")
    public String getCustomerRegistration(){
        return "Welcome customer";
    }

}
