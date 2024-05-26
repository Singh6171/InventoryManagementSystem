/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author gurdeepsingh
 */
public class Tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
//    st.executeUpdate("CREATE TABLE appuser ("
//                 + "appuser_pk INT AUTO_INCREMENT PRIMARY KEY, "
//                 + "userRole VARCHAR(50), "
//                 + "name VARCHAR(200), "
//                 + "mobileNumber VARCHAR(10), "
//                 + "email VARCHAR(200), "
//                 + "password VARCHAR(50), "
//                 + "address VARCHAR(200), "
//                 + "status VARCHAR(50))"
//                 );
            // st.executeUpdate("insert into appuser (userRole, name, mobileNumber, email, password, address, status) values('SuperAdmin', 'Gurdeep Singh', '1223334444', 'gs@test.com', 'Pa$$w0rd', '123 Baker St','Active')");
//            st.executeUpdate("CREATE TABLE category ("
//                    + "category_pk INT AUTO_INCREMENT PRIMARY KEY, "
//                    + "name varchar(200))" ); 
//            st.executeUpdate("CREATE TABLE customer ("
//                    + "customer_pk INT AUTO_INCREMENT PRIMARY KEY, "
//                    + "name VARCHAR(200), " 
//                    +"mobileNumber INT(10),"
//                    + "email VARCHAR(200))");  

            st.executeUpdate("CREATE TABLE orderDetails ("
                    + "order_pk INT AUTO_INCREMENT PRIMARY KEY, "
                    + "orderId VARCHAR(200), "
                    + "customer_fk INT,"
                    + "orderDate VARCHAR(200),"
                    + "totalPaid INT)");

            JOptionPane.showMessageDialog(null, "Table has been created Successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace(); // Log the full stack trace for debugging
        } finally {
            try {
                con.close();

                st.close();
            } catch (Exception e) {
                e.printStackTrace(); // Log the full stack trace for debugging
            }
        }

    }

}
