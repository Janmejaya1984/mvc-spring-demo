package com.customer.app.service;

import com.customer.app.dto.CustomerLoginDTO;

public interface CustomerLoginService {
    public String validateUser(CustomerLoginDTO customerLoginDTO)throws Exception;
}
