package com.qa.amishra.operation;

import com.qa.amishra.DAOStyle.Employee;
import com.qa.amishra.DAOStyle.EmployeeRowMapper;
import com.qa.amishra.query.QueryTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class SelectTable {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Employee getEmployeeRecordById(int id) {

        return jdbcTemplate.queryForObject(QueryTo.selectFromEmpolyeeTableWhere(),new EmployeeRowMapper(),id);
    }


}
