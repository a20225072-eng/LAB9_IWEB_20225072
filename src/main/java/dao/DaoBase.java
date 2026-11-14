package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DaoBase {

    public Connection getConnection() throws SQLException {

        try{
            Class.forName("con.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            throw new SQLException("no se encontró driver");
        }
         String URL = "jdbc:mysql://localhost:3306/lab9_biblioteca";
         String USER = "root";
         String PASS = "root";

        return  DriverManager.getConnection(URL, USER, PASS);

    }
}
