package Engines;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class new_values {

    public boolean NewUser(String names, String tel, String email, String residence, String sex, String dob, int account_id) {
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection con = DriverManager.getConnection(url, user, passwd);
            Statement statement = con.createStatement();
            String sql = " insert into users values(null,'" + names + "','" + tel + "','" + email + "','" + residence + "','" + sex + "','" + dob + "','" + account_id + "')";
            statement.execute(sql);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean NewBranchType(String names) {
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection con = DriverManager.getConnection(url, user, passwd);

            Statement statement = con.createStatement();
            String sql = " insert into branch_type values(null,'" + names + "')";
            statement.execute(sql);
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public boolean NewBranch(String name, String region, int type_id) {
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection con = DriverManager.getConnection(url, user, passwd);

            Statement statement = con.createStatement();
            String sql = " insert into branch values(null,'" + name + "','" + region + "','" + type_id + "')";
            statement.execute(sql);
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public boolean NewProductType(String name) {
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection con = DriverManager.getConnection(url, user, passwd);

            Statement statement = con.createStatement();
            String sql = " insert into product_type values(null,'" + name + "')";
            statement.execute(sql);
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public boolean NewProduct(String name, int quantity, int expected_sale_price, int type_id, String date_bought, int category_id, int branch_id, int unit_price) {
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection con = DriverManager.getConnection(url, user, passwd);

            Statement statement = con.createStatement();
            String sql = " insert into product values(null,'" + name + "','" + quantity + "','" + expected_sale_price + "','" + type_id + "','" + category_id + "','" + date_bought + "','" + branch_id + "','" + unit_price + "')";
            statement.execute(sql);
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public boolean NewDistribution(String distribution_date, int produc_id, int qty, int branch_id) {
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection con = DriverManager.getConnection(url, user, passwd);

            Statement statement = con.createStatement();
            String sql = " insert into product values(null,'" + distribution_date + "','" + produc_id + "','" + qty + "','" + branch_id + "')";
            statement.execute(sql);
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public boolean NewExpenseCategory(String name) {
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection con = DriverManager.getConnection(url, user, passwd);

            Statement statement = con.createStatement();
            String sql = " insert into expenses_category values(null,'" + name + "')";
            statement.execute(sql);
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public boolean NewExpenses(String name, String date, String Agent, int expensse_cat_id, int production_id) {
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection con = DriverManager.getConnection(url, user, passwd);

            Statement statement = con.createStatement();
            String sql = " insert into expenses values(null,'" + name + "','" + date + "','" + Agent + "','" + expensse_cat_id + "','" + production_id + "')";
            statement.execute(sql);
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public boolean NewProduction(String date, int product_id, int items_produced, int interest_rate) {
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection con = DriverManager.getConnection(url, user, passwd);

            Statement statement = con.createStatement();
            String sql = " insert into production values(null,'" + date + "','" + product_id + "','" + items_produced + "','" + interest_rate + "')";
            statement.execute(sql);
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public boolean NewReception(int distribution_id, String date, int branch_id, int quantity) {
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection con = DriverManager.getConnection(url, user, passwd);

            Statement statement = con.createStatement();
            String sql = " insert into reception values(null,'" + distribution_id + "','" + quantity + "','" + date + "','" + branch_id + "')";
            statement.execute(sql);
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public boolean NewAccountType(String type_name) {
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection con = DriverManager.getConnection(url, user, passwd);

            Statement statement = con.createStatement();
            String sql = " insert into account_type values(null,'" + type_name + "')";
            statement.execute(sql);
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public boolean NewAccount(String username, String password, String date, int account_type) {
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection con = DriverManager.getConnection(url, user, passwd);

            Statement statement = con.createStatement();
            String sql = " insert into reception values(null,'" + username + "','" + password + "','" + date + "','" + account_type + "')";
            statement.execute(sql);
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public boolean NewSales(String date, int quantity, int amount_received, int amount_due, int branch_id, int product_id, int cashier_in_charge) {
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection con = DriverManager.getConnection(url, user, passwd);

            Statement statement = con.createStatement();
            String sql = " insert into sales values(null,'" + date + "','" + quantity + "','" + amount_received + "','" + amount_due + "','" + branch_id + "','" + product_id + "','" + cashier_in_charge + "')";
            statement.execute(sql);
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public boolean NewProductCategory(String name) {
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection con = DriverManager.getConnection(url, user, passwd);

            Statement statement = con.createStatement();
            String sql = " insert into prod_categories values(null,'" + name + "')";
            statement.execute(sql);
            return true;
        } catch (Exception e) {

            return false;
        }

    }

    public boolean NewUserInBranch(int user_id, int branch_id) {
        try {
            String url = "jdbc:mysql://localhost:3306/posdb";
            String user = "root";
            String passwd = "";
            Connection con = DriverManager.getConnection(url, user, passwd);
            Statement statement = con.createStatement();
            String sql = " insert into users_in_branch values(null,'" + user_id + "','" + branch_id + "')";
            statement.execute(sql);
            return true;

        } catch (Exception e) {

            return false;
        }

    }

}
