package com.qa.amishra.operation;


import com.qa.amishra.query.QueryTo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class CreateTable {

    private final Logger logger = LoggerFactory.getLogger(CreateTable.class);
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void createEmployeeTable() {
        jdbcTemplate.execute(QueryTo.createEmpolyeeTable());
        logger.info("Table Created");
    }


}
