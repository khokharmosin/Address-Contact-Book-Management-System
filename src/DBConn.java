
import java.sql.*;

public class DBConn {

    public  Driver d;
    public  Connection con;
    public  Statement stmt;
    public  ResultSet rs = null;
    //MYSQL DB Connectivity
     String URL = "jdbc:mysql://localhost:3306/informationbook";
     String username = "root";
     String password = "";

    public  void openCon() {
        try {
            //d = new oracle.jdbc.driver.OracleDriver();
            d = new com.mysql.jdbc.Driver();
            con = DriverManager.getConnection(URL, username, password);
            stmt = con.createStatement();
        } catch (SQLException se) {
            System.out.println("Error in Database Connection");
        }
    }

    public  void nonSelect(String query) {
        try {
            openCon();
            stmt.executeUpdate(query);
            con.close();
        } catch (SQLException se) {
            System.out.println("Query Execution Failed");
        }
    }

    public  void select(String query) {

        try {
            openCon();
            rs = stmt.executeQuery(query);
          //  con.close();
        } catch (SQLException se) {
            System.out.println("Data Access Failed" + se.getMessage());
        }

    }

}
