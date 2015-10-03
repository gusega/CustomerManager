package com.mytech.server.service.impl;

import com.mytech.server.dao.CustomerDAO;
import com.mytech.server.model.Customer;
import com.mytech.server.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDAO customerDAO;

    @Override
    public Customer get(int id) {
        return customerDAO.get(id);
//        return null;
    }
}
