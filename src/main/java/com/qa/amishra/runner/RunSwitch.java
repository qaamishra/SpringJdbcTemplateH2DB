package com.qa.amishra.runner;

import com.qa.amishra.DAOStyle.Employee;
import com.qa.amishra.DAOStyle.EmployeeRowMapper;
import com.qa.amishra.app.SpringJDBCConfig;
import com.qa.amishra.operation.CreateTable;
import com.qa.amishra.operation.DropTable;
import com.qa.amishra.operation.InsertTable;
import com.qa.amishra.operation.SelectTable;
import com.qa.amishra.query.QueryTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class RunSwitch {

    //Make sure before running this ,no other instance of H2 is running on your local. If you are in already in the console please click on disconnet button from the console
    //http://localhost:8082/login.jsp?
    //INFO: Loaded JDBC driver: org.h2.Driver
    //Exception in thread "main" org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is org.h2.jdbc.JdbcSQLException: Database may be already in use: null. Possible solutions: close all other connection(s); use the server mode [90020-197]


    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJDBCConfig.class);

        DropTable dropTable = context.getBean(DropTable.class);
        dropTable.dropEmployeeTable();

        CreateTable createTable = context.getBean(CreateTable.class);
        createTable.createEmployeeTable();

        InsertTable insertTable = context.getBean(InsertTable.class);
        insertTable.insertRecordIntoEmployeeTable(1, "AshutoshMishra1", 542001201);
        insertTable.insertRecordIntoEmployeeTable(2, "AshutoshMishra2", 542001202);
        insertTable.insertRecordIntoEmployeeTable(3, "AshutoshMishra3", 542001203);

        //Update
        insertTable.insertIntoEmployeeTableWhere(3, "Test", 123456);

        //Result when you login http://localhost:8082/login.jsp? after execution of this program
        /*
        SELECT * FROM EMPLOYEE;
        ID  	NAME  	PHONE
        1	AshutoshMishra1	542001201
        2	AshutoshMishra2	542001202
        3	Test	123456
        */


        SelectTable selectTable=context.getBean(SelectTable.class);
        Employee e=selectTable.getEmployeeRecordById(2);
        System.out.println(e.toString());

        System.out.println("\n ==============");

        System.out.println("ID = "+e.getID() );
        System.out.println("NAME = "+e.getNAME() );
        System.out.println("PHONE = "+e.getPHONE() );



    }
}
