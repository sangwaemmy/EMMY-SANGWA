/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Engines;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class single_values {

    public int get_userid(String name) {
        int id = 0;
        try {

            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement state = conn.createStatement();
            ResultSet result = state.executeQuery("SELECT account.accountid FROM account WHERE account.username='"+ name +"' ORDER BY account.accountid ASC ");
            result.next();
             id = result.getInt("accountid");
         
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return id;
    }

    int get_branchid(String name) {
        int id = 0;
        try {

            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement state = conn.createStatement();
            ResultSet result = state.executeQuery("SELECT branch.branch_id  FROM branch WHERE (branch.name='"+ name+"') ORDER BY branch.branch_id ASC ");
            result.next();
            int lb = result.getInt("productid");
            String nlb = Integer.toString(lb);
            id = Integer.parseInt(nlb);
        } catch (Exception e) {

        }
        return id;
    }

    int get_productid(String name) {
        int id = 0;
        try {

            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement state = conn.createStatement();
            ResultSet result = state.executeQuery("SELECT product.product_id FROM product WHERE (product.name='"+ name+"') ORDER BY product.product_id ASC ");
            result.next();
            int lb = result.getInt("productid");
            String nlb = Integer.toString(lb);
            id = Integer.parseInt(nlb);
        } catch (Exception e) {

        }
        return id;
    }

    int get_expenseid(String name) {
        int id = 0;
        try {

            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement state = conn.createStatement();
            ResultSet result = state.executeQuery("SELECT expenses_category.category_id  FROM expenses_category WHERE (expenses_category.name='"+ name+"')");
            result.next();
            int lb = result.getInt("productid");
            String nlb = Integer.toString(lb);
            id = Integer.parseInt(nlb);
        } catch (Exception e) {

        }
        return id;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

}
