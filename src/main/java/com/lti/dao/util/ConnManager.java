package com.lti.dao.util;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnManager {

	public static Connection connect() throws SQLException {
		try {

			Properties dpProps = new Properties();
			dpProps.load(ConnManager.class.getClassLoader().getResourceAsStream("dev-db.properties"));
			
			Class.forName(dpProps.getProperty("driverName")).newInstance();
			return DriverManager.getConnection(dpProps.getProperty("url"), dpProps.getProperty("user"), dpProps.getProperty("pass"));

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
