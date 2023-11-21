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

public class koneksi {
    public static void main(String[] args) {
        BasisData basisdata = new BasisData();
        Connection connection = basisdata.getKoneksi();

        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection closed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
