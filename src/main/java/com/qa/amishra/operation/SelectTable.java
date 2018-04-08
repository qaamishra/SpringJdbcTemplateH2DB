package com.qa.amishra.operation;

import com.qa.amishra.DAOStyle.Employee;
import com.qa.amishra.DAOStyle.EmployeeRowMapper;
import com.qa.amishra.query.QueryTo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class SelectTable {

    private final Logger logger = LoggerFactory.getLogger(SelectTable.class);

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Employee getEmployeeRecordById(int id) {

        logger.info("getEmployeeRecordById");
        return jdbcTemplate.queryForObject(QueryTo.selectFromEmpolyeeTableWhere(),new EmployeeRowMapper(),id);

    }


}
