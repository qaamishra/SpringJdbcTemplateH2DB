package com.qa.amishra.operation;

import com.qa.amishra.query.QueryTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class CreateTable {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void createEmployeeTable() {
        jdbcTemplate.execute(QueryTo.createEmpolyeeTable());
    }


}
