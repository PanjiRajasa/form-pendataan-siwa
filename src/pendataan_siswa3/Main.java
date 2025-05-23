/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pendataan_siswa3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author 1234
 */
public class Main {
    public static Connection connection;
    
    public static void main(String[] args) {
        
        //mysql connector
        if (connection == null) {
            try {
                
                String url = "jdbc:mysql://localhost:3306/pendataan_siswa"; // ganti namadatabase
                String user = "root";  // ganti kalau user MySQL kamu berbeda
                String password = "";  // isi password kalau ada

                //Class.forName("com.mysql.cj.jdbc.Driver");
//                connection = DriverManager.getConnection(url, user, password);
//                System.out.println("Connection success!");

                Connection conn = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi ke MySQL berhasil.");

//                Statement stmt = conn.createStatement();
//                ResultSet rs = stmt.executeQuery("SHOW DATABASES;");
//
//                System.out.println("Daftar database:");
//                while (rs.next()) {
//                    System.out.println("- " + rs.getString(1));
//                }

                conn.close();
                 
            } //catch (ClassNotFoundException | SQLException e) {
//                System.out.println("Connection Failed: " + e.getMessage());
//            }
            catch (SQLException e) {
                System.out.println("Koneksi gagal: " + e.getMessage());
            }
        }
        
        // Tampilkan FormUtama di event dispatch thread
        javax.swing.SwingUtilities.invokeLater(() -> {
            new Form_Utama().setVisible(true);
        });
    }
}
