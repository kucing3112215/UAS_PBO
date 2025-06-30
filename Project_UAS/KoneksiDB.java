/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Project_UAS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alfarizi Bima Setyawan
 * Kelas Pemrogaman Berorientasi Objek - 2B
 * Alfarizi311215@gmail.com
 */
public class KoneksiDB {

     private static final String URL = "jdbc:mysql://localhost:3306/db_toko"; // sesuaikan dengan nama database 
    private static final String USER = "root"; // sesuaikan dengan username database 
    private static final String PASSWORD = ""; // default kosong jika pakai XAMPP

    public static Connection getConnection() {
        try {
            // Load driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Kembalikan koneksi
            return DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Koneksi ke database gagal: " + e.getMessage());
            return null;
        }
    }
}

