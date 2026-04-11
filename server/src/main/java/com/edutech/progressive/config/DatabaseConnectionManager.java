package com.edutech.progressive.config;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager {
    static Properties properties;

    void loadProperties(){
        try(InputStream input = DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties")){
            if(input != null){
                properties.load(input);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(
            properties.getProperty("spring.datasource.url"),
            properties.getProperty("spring.datasource.username"),
            properties.getProperty("spring.datasource.password")
        );
    }

}
