/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartCitySearchEngine;

/**
 *
 * @author ashik
 */
import java.sql.*;
import javax.swing.*;
public class SQLiteJDBCDriverConnection {
    Connection conn;
    @SuppressWarnings("empty-statement")
 public static Connection ConnectDB()
 {
     try{
         Class.forName("org.sqlite.JDBC");
         Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ashik\\Documents\\NetBeansProjects\\SmartCitySearchEngine\\SmartCity.sqlite");
         return conn;
     }catch (ClassNotFoundException | SQLException e){
         JOptionPane.showMessageDialog(null,e);
     }
     return null;
 }
}