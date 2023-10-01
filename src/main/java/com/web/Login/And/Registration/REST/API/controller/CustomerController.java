package com.web.Login.And.Registration.REST.API.controller;

import com.web.Login.And.Registration.REST.API.dto.CustomerDto;
import com.web.Login.And.Registration.REST.API.dto.LoginDto;
import com.web.Login.And.Registration.REST.API.response.LoginMessage;
import com.web.Login.And.Registration.REST.API.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping("/save")
    public String saveCustomer(@RequestBody CustomerDto customerDto){
        String id = customerService.addCustomer(customerDto);
        return id;
    }
    @PostMapping("/login")
    public ResponseEntity<?> loginCustomer(@RequestBody LoginDto loginDto){
       LoginMessage loginMessage = customerService.loginCustomer(loginDto);
       return ResponseEntity.ok(loginMessage);

    }
}
