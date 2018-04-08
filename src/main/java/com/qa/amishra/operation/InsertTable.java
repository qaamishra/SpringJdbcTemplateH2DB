package com.qa.amishra.operation;

import com.qa.amishra.query.QueryTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class InsertTable {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insertRecordIntoEmployeeTable(int id,String name,int phone) {

        jdbcTemplate.update(QueryTo.insertIntoEmpolyeeTable(),id,name,phone);
    }

    public void insertIntoEmployeeTableWhere(int id,String name,int phone) {

        jdbcTemplate.update(QueryTo.insertIntoEmpolyeeTableWhere(),name,phone,id);
    }

}
