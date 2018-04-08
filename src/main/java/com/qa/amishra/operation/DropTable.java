package com.qa.amishra.operation;

import com.qa.amishra.query.QueryTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DropTable {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void dropEmployeeTable() {
        jdbcTemplate.execute(QueryTo.dropEmpolyeeTable());
    }

}
