package com.customer.app.dao;

import com.customer.app.dto.CustomerLoginDTO;

import java.util.HashMap;
import java.util.Map;

public class CustomerDAOImpl implements CustomerDAO{

    @Override
    public CustomerLoginDTO getUserUsingUserName(String userName) {
        Map<String,String> userMap = new HashMap<String,String>();
        userMap.put("tom","tom123");
        userMap.put("john","john123");
        userMap.put("foo","foo123");
        userMap.put("bar","bar123");
        CustomerLoginDTO customerLoginDTO = new CustomerLoginDTO();
        customerLoginDTO.setUserName(userName);
        customerLoginDTO.setPassword(userMap.get(userName));
        return customerLoginDTO;
    }
}
