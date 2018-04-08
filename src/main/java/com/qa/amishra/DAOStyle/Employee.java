package com.qa.amishra.DAOStyle;

//It is better to implement RowMapper than ResultSetExtractor because a single row returned from the table has to be mapped to a single java object.
//https://dzone.com/articles/spring-jdbc-rowmapper-vs-resultsetextractor


public class Employee {
    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", PHONE=" + PHONE +
                '}';
    }

    private int ID;
    private String NAME;
    private int PHONE;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public void setPHONE(int PHONE) {
        this.PHONE = PHONE;
    }

    public int getID() {

        return ID;
    }

    public String getNAME() {
        return NAME;
    }

    public int getPHONE() {
        return PHONE;
    }
}
