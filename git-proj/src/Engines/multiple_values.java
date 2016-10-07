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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class multiple_values extends JFrame {

    public int all_accounts() {
        int Count = 0;
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement state = conn.createStatement();
            String query = " select * from account";
            Statement stmt = conn.createStatement();

            ResultSet res = stmt.executeQuery(query);

            while (res.next()) {
                Count++;
            }
            // Count= res.getInt("productid");

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return Count;
    }

    public int all_account_types() {
        int Count = 0;
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement state = conn.createStatement();
            String query = " select * from account_type";
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                Count++;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return Count;
    }

    public int all_branches() {
        int Count = 0;
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement state = conn.createStatement();
            String query = " select * from branch";
            Statement stmt = conn.createStatement();

            ResultSet res = stmt.executeQuery(query);

            while (res.next()) {
                Count++;
            }
            // Count= res.getInt("productid");

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return Count;
    }

    public int all_branches_types() {
        int Count = 0;
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement state = conn.createStatement();
            String query = " select * from branch_type";
            Statement stmt = conn.createStatement();

            ResultSet res = stmt.executeQuery(query);

            while (res.next()) {
                Count++;
            }
            // Count= res.getInt("productid");

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return Count;
    }

    public int all_distributions() {
        int Count = 0;
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement state = conn.createStatement();
            String query = " select * from distribution";
            Statement stmt = conn.createStatement();

            ResultSet res = stmt.executeQuery(query);

            while (res.next()) {
                Count++;
            }
            // Count= res.getInt("productid");

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return Count;
    }

    public int all_expenses() {
        int Count = 0;
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement state = conn.createStatement();
            String query = " select * from expenses";
            Statement stmt = conn.createStatement();

            ResultSet res = stmt.executeQuery(query);

            while (res.next()) {
                Count++;
            }
            // Count= res.getInt("productid");

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return Count;
    }

    public int all_expense_categories() {
        int Count = 0;
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement state = conn.createStatement();
            String query = " select * from expenses_category";
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                Count++;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return Count;
    }

    public int all_prod_categories() {
        int Count = 0;
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement state = conn.createStatement();
            String query = " select * from prod_categories";
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                Count++;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return Count;
    }

    public int all_prods() {
        int Count = 0;
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement state = conn.createStatement();
            String query = " select * from product";
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                Count++;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return Count;
    }

    public int all_productions() {
        int Count = 0;
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement state = conn.createStatement();
            String query = " select * from production";
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                Count++;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return Count;
    }

    public int all_receptions() {
        int Count = 0;
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement state = conn.createStatement();
            String query = " select * from reception";
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                Count++;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return Count;
    }

    public int all_sales() {
        int Count = 0;
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement state = conn.createStatement();
            String query = " select * from sales";
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                Count++;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return Count;
    }

    public int all_uses() {
        int Count = 0;
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement state = conn.createStatement();
            String query = " select * from users";
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                Count++;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return Count;
    }

    public int all_users() {
        int Count = 0;

        return Count;
    }

    public void load_accounts(JTable tb) {
        try {
            String url = "jdbc:mysql://localhost:3306/barmanbeer";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);

            Statement state = conn.createStatement();
            String query = "select * from account";
            Statement stmt = conn.createStatement();
            String title[] = new String[]{"account id", "username", "password", "creation date", "account type"};
            Object[][] data = new Object[all_branches_types()][50];
            ResultSet res = stmt.executeQuery(query);
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getInt(1);
                data[i][1] = res.getString(2);
                data[i][2] = res.getString(3);
                data[i][3] = res.getDate(4);
                data[i][4] = res.getInt(5);

                i++;
            }
            tb.setModel(new DefaultTableModel(data, title));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }

    public void load_account_types(JTable tb) {
        try {
            String url = "jdbc:mysql://localhost:3306/barmanbeer";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);

            Statement state = conn.createStatement();
            String query = "select * from account_type";
            Statement stmt = conn.createStatement();
            String title[] = new String[]{"category id", "category name"};
            Object[][] data = new Object[all_branches_types()][50];
            ResultSet res = stmt.executeQuery(query);
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getInt(1);
                data[i][1] = res.getString(2);
                i++;
            }
            tb.setModel(new DefaultTableModel(data, title));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }

    public void load_bracnhes(JTable tb) {
        try {
            String url = "jdbc:mysql://localhost:3306/barmanbeer";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);

            Statement state = conn.createStatement();
            String query = "select * from branch";
            Statement stmt = conn.createStatement();
            String title[] = new String[]{"branch id", "name", "region", "types"};
            Object[][] data = new Object[all_branches_types()][50];
            ResultSet res = stmt.executeQuery(query);
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getInt(1);
                data[i][1] = res.getString(2);
                data[i][2] = res.getString(3);
                data[i][3] = res.getInt(4);
                i++;
            }
            tb.setModel(new DefaultTableModel(data, title));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }

    public void load_branches_types(JTable tb) {
        try {
            String url = "jdbc:mysql://localhost:3306/barmanbeer";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);

            Statement state = conn.createStatement();
            String query = "select * from branch_type";
            Statement stmt = conn.createStatement();
            String title[] = new String[]{"type_id", "type name"};
            Object[][] data = new Object[all_branches_types()][50];
            ResultSet res = stmt.executeQuery(query);
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getInt(1);
                data[i][1] = res.getString(2);
                i++;
            }
            tb.setModel(new DefaultTableModel(data, title));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }

    public void load_distributions(JTable tb) {
        try {
            String url = "jdbc:mysql://localhost:3306/barmanbeer";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);

            Statement state = conn.createStatement();
            String query = "select * from distribution";
            Statement stmt = conn.createStatement();
            String title[] = new String[]{"dustributin number", "Date", "product", "Quantity", "branch number"};
            Object[][] data = new Object[all_branches_types()][50];
            ResultSet res = stmt.executeQuery(query);
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getInt(1);
                data[i][1] = res.getDate(2);
                data[i][2] = res.getInt(3);
                data[i][3] = res.getInt(4);
                i++;
            }
            tb.setModel(new DefaultTableModel(data, title));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }

    public void load_expenses(JTable tb) {
        try {
            String url = "jdbc:mysql://localhost:3306/barmanbeer";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);

            Statement state = conn.createStatement();
            String query = "select * from expenses";
            Statement stmt = conn.createStatement();
            String title[] = new String[]{"expense number", "name", "agent", "category number", "product number"};
            Object[][] data = new Object[all_branches_types()][50];
            ResultSet res = stmt.executeQuery(query);
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getInt(1);
                data[i][1] = res.getString(2);
                data[i][2] = res.getInt(3);
                data[i][3] = res.getInt(4);
                data[i][4] = res.getInt(5);

                i++;
            }
            tb.setModel(new DefaultTableModel(data, title));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }

    public void load_expense_categories(JTable tb) {
        try {
            String url = "jdbc:mysql://localhost:3306/barmanbeer";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);

            Statement state = conn.createStatement();
            String query = "select * from expensee_category";
            Statement stmt = conn.createStatement();
            String title[] = new String[]{"Category number", "name"};
            Object[][] data = new Object[all_branches_types()][50];
            ResultSet res = stmt.executeQuery(query);
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getInt(1);
                data[i][1] = res.getString(2);

                i++;
            }
            tb.setModel(new DefaultTableModel(data, title));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }

    public void load_prod_categories(JTable tb) {
        try {
            String url = "jdbc:mysql://localhost:3306/barmanbeer";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement state = conn.createStatement();
            String query = "select * from prod_categories";
            Statement stmt = conn.createStatement();
            String title[] = new String[]{"Category number", "Name"};
            Object[][] data = new Object[all_branches_types()][50];
            ResultSet res = stmt.executeQuery(query);
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getInt(1);
                data[i][1] = res.getString(2);
                i++;
            }
            tb.setModel(new DefaultTableModel(data, title));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }

    public void load_prods(JTable tb) {
        try {
            String url = "jdbc:mysql://localhost:3306/barmanbeer";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);

            Statement state = conn.createStatement();
            String query = "select * from product";
            Statement stmt = conn.createStatement();
            String title[] = new String[]{"Product id", "Name", "Quantity", "Expected price", "Type", "Date", "Category", "Brannch number", "unit price"};
            Object[][] data = new Object[all_branches_types()][50];
            ResultSet res = stmt.executeQuery(query);
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getInt(1);
                data[i][1] = res.getString(2);
                data[i][2] = res.getInt(3);
                data[i][3] = res.getInt(4);
                data[i][4] = res.getInt(5);
                data[i][5] = res.getInt(6);
                data[i][6] = res.getDate(7);
                data[i][7] = res.getInt(8);
                data[i][8] = res.getInt(9);

                i++;
            }
            tb.setModel(new DefaultTableModel(data, title));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }

    public void load_productions(JTable tb) {
        try {
            String url = "jdbc:mysql://localhost:3306/barmanbeer";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);

            Statement state = conn.createStatement();
            String query = "select * from production";
            Statement stmt = conn.createStatement();
            String title[] = new String[]{"production id", "Date", "production number", "Items produced", "Interest rate"};
            Object[][] data = new Object[all_branches_types()][50];
            ResultSet res = stmt.executeQuery(query);
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getInt(1);
                data[i][1] = res.getDate(2);
                data[i][2] = res.getInt(3);
                data[i][3] = res.getInt(4);
                data[i][4] = res.getInt(5);

                i++;
            }
            tb.setModel(new DefaultTableModel(data, title));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }

    public void load_receptions(JTable tb) {
        try {
            String url = "jdbc:mysql://localhost:3306/barmanbeer";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);

            Statement state = conn.createStatement();
            String query = "select * from reception";
            Statement stmt = conn.createStatement();
            String title[] = new String[]{"Reception number", "Distribution reference", "Quantity", "Reception date", "Branch number"};
            Object[][] data = new Object[all_branches_types()][50];
            ResultSet res = stmt.executeQuery(query);
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getInt(1);
                data[i][1] = res.getInt(2);
                data[i][2] = res.getInt(3);
                data[i][3] = res.getDate(4);
                data[i][4] = res.getInt(5);

                i++;
            }
            tb.setModel(new DefaultTableModel(data, title));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }

    public void load_sales(JTable tb) {
        try {
            String url = "jdbc:mysql://localhost:3306/barmanbeer";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);

            Statement state = conn.createStatement();
            String query = "select * from sales";
            Statement stmt = conn.createStatement();
            String title[] = new String[]{"Sale number", "Date", "Quantity", "Amount received", "Amount due", "Customer", "Branch number", "Product number", "Cashier"};
            Object[][] data = new Object[all_branches_types()][50];
            ResultSet res = stmt.executeQuery(query);
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getInt(1);
                data[i][1] = res.getDate(2);
                data[i][2] = res.getInt(3);
                data[i][3] = res.getInt(4);
                data[i][4] = res.getInt(5);
                data[i][5] = res.getInt(6);
                data[i][6] = res.getInt(7);
                data[i][7] = res.getInt(8);
                data[i][8] = res.getInt(9);

                i++;
            }
            tb.setModel(new DefaultTableModel(data, title));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }

    public void load_users_branch(JTable tb) {
        try {
            String url = "jdbc:mysql://localhost:3306/barmanbeer";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);

            Statement state = conn.createStatement();
            String query = "select * from users_in_branch";
            Statement stmt = conn.createStatement();
            String title[] = new String[]{"user number", "Branch number"};
            Object[][] data = new Object[all_branches_types()][50];
            ResultSet res = stmt.executeQuery(query);
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getInt(1);
                data[i][1] = res.getInt(2);
                i++;
            }
            tb.setModel(new DefaultTableModel(data, title));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }

    public int load_users() {
        int Count = 0;

        return Count;
    }

    public void purchase_by_product(String prod, JTable tb) {
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);

            Statement state = conn.createStatement();
            String query = "SELECT * FROM product WHERE (name='" + prod + "')";
            Statement stmt = conn.createStatement();
            String title[] = new String[]{"product id", "name", "qunatity", "Type ", "Category ", "Date", "branch number  ", "unit price"};
            Object[][] data = new Object[all_prods()][50];
            ResultSet res = stmt.executeQuery(query);
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getInt(1);
                data[i][1] = res.getString(2);
                data[i][2] = res.getString(3);
                data[i][3] = res.getInt(4);
                data[i][4] = res.getInt(5);

                data[i][5] = res.getString(6);
                data[i][6] = res.getString(7);
                data[i][7] = res.getInt(8);

                i++;
            }
            tb.setModel(new DefaultTableModel(data, title));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }

    public void purchase_by_date(String date, JTable tb) {
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);

            Statement state = conn.createStatement();
            String query = "SELECT * FROM product WHERE (date_bought='" + date + "')";
            Statement stmt = conn.createStatement();
            String title[] = new String[]{"product id", "name", "qunatity", "Type ", "Category ", "Date", "branch number  ", "unit price"};
            Object[][] data = new Object[all_prods()][50];
            ResultSet res = stmt.executeQuery(query);
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getInt(1);
                data[i][1] = res.getString(2);
                data[i][2] = res.getString(3);
                data[i][3] = res.getInt(4);
                data[i][4] = res.getInt(5);

                data[i][5] = res.getString(6);
                data[i][6] = res.getString(7);
                data[i][7] = res.getInt(8);

                i++;
            }
            tb.setModel(new DefaultTableModel(data, title));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }

    public void sales_by_product(String product, JTable tb) {
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);

            Statement state = conn.createStatement();
            String query = "SELECT  sales.date,sales.quantity,sales.branch_id,sales.product_id,sales.cashier_in_charge, product.name  FROM sales  LEFT JOIN product ON product.product_id = sales.product_id  WHERE (product.name='" + product + "')";
            Statement stmt = conn.createStatement();
            String title[] = new String[]{"Sale id", "Date", "qunatity", "Branch number ", "product number ", "Cashier in charge"};
            Object[][] data = new Object[all_sales()][50];
            ResultSet res = stmt.executeQuery(query);
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getInt(1);
                data[i][1] = res.getDate(2);
                data[i][2] = res.getInt(3);
                data[i][3] = res.getInt(4);
                data[i][4] = res.getInt(5);
                data[i][5] = res.getInt(6);
                i++;
            }
            tb.setModel(new DefaultTableModel(data, title));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }

    public void sales_by_date(String date, JTable tb) {
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            String query = "SELECT  sales.date,sales.quantity,sales.branch_id,sales.product_id,sales.cashier_in_charge, product.name  FROM sales  LEFT JOIN product ON product.product_id = sales.product_id  WHERE (product.name='" + date + "')";
            Statement state = conn.createStatement();
            Statement stmt = conn.createStatement();
            String title[] = new String[]{"Sale id", "Date", "qunatity", "Branch number ", "product number ", "Cashier in charge"};
            Object[][] data = new Object[all_sales()][50];
            ResultSet res = stmt.executeQuery(query);
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getInt(1);
                data[i][1] = res.getDate(2);
                data[i][2] = res.getInt(3);
                data[i][3] = res.getInt(4);
                data[i][4] = res.getInt(5);
                data[i][5] = res.getInt(6);

                i++;
            }
            tb.setModel(new DefaultTableModel(data, title));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }

    public int Usernumber(String uname, String upass) {
        int userid = 0;
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery("select accountid FROM account where username='" + uname + "' and password='" + upass + "'");
            if (res.next()) {
                userid = res.getInt("accountid");
                return userid;
            }
        } catch (Exception e) {
            System.out.print(e.toString());
        }
        return userid;
    }

}
