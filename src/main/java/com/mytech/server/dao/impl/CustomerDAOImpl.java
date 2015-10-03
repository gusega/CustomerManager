package com.mytech.server.dao.impl;

import javax.sql.DataSource;

import com.mytech.server.dao.CustomerDAO;
import com.mytech.server.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
    private NamedParameterJdbcOperations jdbcTemplate;

    @Autowired
    public void setNamedParameterJdbcOperations(DataSource dataSource) {
        jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public Customer get(int id) {
        return null;
    }
}
