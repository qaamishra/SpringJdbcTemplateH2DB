package com.qa.amishra.operation;

import com.qa.amishra.query.QueryTo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class InsertTable {

    private final Logger logger = LoggerFactory.getLogger(InsertTable.class);

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insertRecordIntoEmployeeTable(int id,String name,int phone) {

        jdbcTemplate.update(QueryTo.insertIntoEmpolyeeTable(),id,name,phone);
        logger.info("insertRecordIntoEmployeeTable | Row Inserted");
    }

    public void insertIntoEmployeeTableWhere(int id,String name,int phone) {

        jdbcTemplate.update(QueryTo.insertIntoEmpolyeeTableWhere(),name,phone,id);
        logger.info("insertIntoEmployeeTableWhere | Row Inserted");
    }

}
