package classwork.JDBC.SimpleConnect;

import java.sql.*;

public class ConnectMySQL {
    public static void main(String[] args) throws SQLException {
        String dbuser = "root";
        String dbpassword = "5M%k4nFv=RZt";

        String connString = "jdbc:mysql://localhost:3306/schoolmis?useSSL=false&serverTimezone=UTC";
        Connection con = null;

        try {
            con = DriverManager.getConnection(connString, dbuser, dbpassword);
        } catch(SQLException e) {
            System.out.println("Error Connecting!");
            e.printStackTrace();
        }

        Statement stmt = con.createStatement();
        ResultSet res = stmt.executeQuery("SELECT * FROM student");

        while (res.next()) {
            System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3));
        }

        con.close();
    }
}
