/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbasdat;

/**
 *
 * @author User
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BasisData {
    private static Connection koneksi;
    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String connectionUrl = "jdbc:sqlserver://LAPTOP-N2PAIEPK\\SQLEXPRESS:1433;databaseName=OPTIKMURAH;user=admin;password=170603;encrypt=true;trustServerCertificate=true";
                DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
                koneksi = DriverManager.getConnection(connectionUrl);
                System.out.println("Koneksi berhasil");
            } catch (SQLException e) {
                System.out.println("Koneksi error / tidak berhasil");
                e.printStackTrace();
            }
        }
        return koneksi;
    }
}
