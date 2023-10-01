package com.web.Login.And.Registration.REST.API.service;

import com.web.Login.And.Registration.REST.API.dto.CustomerDto;
import com.web.Login.And.Registration.REST.API.dto.LoginDto;
import com.web.Login.And.Registration.REST.API.response.LoginMessage;

public interface ICustomerService {
    String addCustomer(CustomerDto customerDto);
    LoginMessage loginCustomer (LoginDto loginDto);

}
