package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteCust {
    public static void main(String[] args) {
        // 1. MySQL Driver Loading ...
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found");
        }
        // 2. Connection ...
        String url = "jdbc:mysql://192.168.0.250:3306/shopdb";
        String user = "smuser";
        String password = "111111";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database successfully");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        // 3. SQL 문장 생성
        String deleteSql = "DELETE FROM cust WHERE cust_id = ?";
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(deleteSql);
            pstmt.setString(1,"id22");
            // 4. SQL 문장 전송
            int result = pstmt.executeUpdate();
            System.out.println("delete successfully: " + result);
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        } finally {
            // 5. Close
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {}
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }

        }
    }
}