package com.customer.app.service;

import com.customer.app.dao.CustomerDAO;
import com.customer.app.dao.CustomerDAOImpl;
import com.customer.app.dto.CustomerLoginDTO;

public class CustomerLoginServiceImpl implements CustomerLoginService {
    private CustomerDAO customerDAO;
    @Override
    public String validateUser(CustomerLoginDTO customerLoginDTO)throws Exception {
        customerDAO = new CustomerDAOImpl();
       CustomerLoginDTO customerLoginDTOFromDao =  customerDAO.getUserUsingUserName(customerLoginDTO.getUserName());
       if(customerLoginDTO.getPassword().equals(customerLoginDTOFromDao.getPassword())){
           return "Login successfully!!!!!!!";
       }else{
           throw new Exception("Invalid Username or Password");
       }

    }
}
