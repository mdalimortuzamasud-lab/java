/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class databaseUtil {
    private Connection con= null;
    private String url="jdbc:mysql://localhost:3306//studentModel";
    private String User="root";
    private  String password="1234";
    private String driver="com.mysql.cj.jdbc.Driver";
    
    public Connection getcon(){
        try {
            Class.forName(driver);
            con=DriverManager.getConnection(url, User, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(databaseUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(databaseUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return con;
        
        
    } 
}   