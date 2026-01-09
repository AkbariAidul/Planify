package com.aidul.planify; // Sesuaikan dengan nama package-mu

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Pastikan nama database 'planify_db' sesuai dengan di phpMyAdmin
    private static final String URL = "jdbc:mysql://localhost:3306/swing_planify";
    private static final String USER = "root";
    private static final String PASS = ""; // Kosongkan jika default XAMPP

    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal: " + e.getMessage());
            return null;
        }
    }
}