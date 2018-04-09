package com.wll.starter.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Deprecated
@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
}
