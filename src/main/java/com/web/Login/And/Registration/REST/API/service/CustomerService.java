package com.web.Login.And.Registration.REST.API.service;

import com.web.Login.And.Registration.REST.API.dto.CustomerDto;
import com.web.Login.And.Registration.REST.API.dto.LoginDto;
import com.web.Login.And.Registration.REST.API.entity.Customer;
import com.web.Login.And.Registration.REST.API.repository.CustomerRepository;
import com.web.Login.And.Registration.REST.API.response.LoginMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addCustomer(CustomerDto customerDto) {
        Customer customer = new Customer(
        customerDto.getCustomerId(),
        customerDto.getCustomerName(),
        customerDto.getEmail(),
        customerDto.getDob(),
        customerDto.getAddress(),
        this.passwordEncoder.encode(customerDto.getPassword())
        );
        customerRepository.save(customer);
        return customer.getCustomerName();
    }

    @Override
    public LoginMessage loginCustomer(LoginDto loginDto) {
        String msg = "";
        Customer customer1 = customerRepository.findByEmail(loginDto.getEmail());
        if (customer1 != null) {
            String password = loginDto.getPassword();
            String encodedPassword = customer1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<Customer> employee = customerRepository.findOneByEmailAndPassword(loginDto.getEmail(), encodedPassword);
                if (employee.isPresent()) {
                    return new LoginMessage("Login Success", true);
                } else {
                    return new LoginMessage("Login Failed", false);
                }
            } else {
                return new LoginMessage("password Not Match", false);
            }
        }else {
            return new LoginMessage("Email not exits", false);
        }
    }

}

