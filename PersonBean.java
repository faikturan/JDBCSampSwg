package com.faikturan;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;

public class PersonBean {

	static final String JDBC_Driver = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc://localhost:3306/demo";
	static final String DB_USER = "root";
	static final String DB_PASS = "123456";
	private JdbcRowSet rowSet = null;
	
	public PersonBean() {
		try {
			Class.forName(JDBC_Driver);
			rowSet.setUrl(DB_URL);
			rowSet.setUsername(DB_USER);
			rowSet.setPassword(DB_PASS);
			rowSet.setCommand("SELECT * FROM Person");
			rowSet.execute();
		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	
	public Person create(Person p){
		try {
			rowSet.moveToInsertRow();
			rowSet.updateInt("personId", p.getPersonId());
			rowSet.updateString("firstName", p.getFirstName());
			rowSet.updateString("middleName", p.getMiddleName());
			rowSet.updateString("lastName", p.getLastName());
			rowSet.updateString("email", p.getEmail());
			rowSet.updateString("phone", p.getPhone());
			rowSet.insertRow();
			rowSet.moveToCurrentRow();
		}catch (SQLException ex) {
			try {
				rowSet.rollback();
				p = null;
			} catch (SQLException e) {
				
			}
			ex.printStackTrace();
		}
		
		return p;
	}
	
	public Person update(Person p){
		try {
			rowSet.updateString("firstName", p.getFirstName());
			rowSet.updateString("middleName", p.getMiddleName());
			rowSet.updateString("lastName", p.getLastName());
			rowSet.updateString("email", p.getEmail());
			rowSet.updateString("phone", p.getPhone());
			rowSet.updateRow();
			rowSet.moveToCurrentRow();
		}catch (SQLException ex) {
			try {
				rowSet.rollback();
				p = null;
			} catch (SQLException e) {
				
			}
			ex.printStackTrace();
		}
		return p;
		
	}
}
