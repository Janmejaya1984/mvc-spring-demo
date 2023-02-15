package com.customer.app.dao;

import com.customer.app.dto.CustomerLoginDTO;

public interface CustomerDAO {
    public CustomerLoginDTO getUserUsingUserName(String userName);
}
