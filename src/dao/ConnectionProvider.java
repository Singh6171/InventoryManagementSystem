/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author gurdeepsingh
 */
public class ConnectionProvider {
    
   public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Corrected driver class name
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?useSSL=false&serverTimezone=UTC", "root", "Tiwana@6171");
            return con;
            
        } catch (Exception e) {
            System.out.println("Error establishing database connection: " + e.getMessage());
            e.printStackTrace(); // Log the full stack trace for debugging
            return null;
        }
    }
        
    }
    

