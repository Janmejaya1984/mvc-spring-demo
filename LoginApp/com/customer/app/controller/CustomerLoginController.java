package com.customer.app.controller;

import com.customer.app.dto.CustomerLoginDTO;
import com.customer.app.service.CustomerLoginService;
import com.customer.app.service.CustomerLoginServiceImpl;

public class CustomerLoginController {
    private CustomerLoginService customerLoginService;
    public String authenticate(CustomerLoginDTO customerLoginDTO)throws Exception{
        try {
            customerLoginService = new CustomerLoginServiceImpl();
            String message = customerLoginService.validateUser(customerLoginDTO);
            return message;
        }catch(Exception ex){
            System.out.println(ex);
            ex.printStackTrace();
            System.out.println("Error in login! Try again with valid username and password!!");
        }
        return "";
    }
}
