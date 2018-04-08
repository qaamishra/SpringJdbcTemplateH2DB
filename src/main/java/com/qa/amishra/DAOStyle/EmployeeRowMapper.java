package com.qa.amishra.DAOStyle;

import com.sun.tracing.dtrace.Attributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeeRowMapper implements RowMapper<Employee> {


    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {

        Employee employee=new Employee();
        employee.setID(resultSet.getInt("ID"));
        employee.setNAME(resultSet.getString("NAME"));
        employee.setPHONE(resultSet.getInt("PHONE"));


        return employee;
    }
}
