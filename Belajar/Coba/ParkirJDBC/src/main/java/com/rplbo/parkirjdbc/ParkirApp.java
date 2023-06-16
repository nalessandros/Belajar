package com.rplbo.parkirjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ParkirApp {
    private final static String url = "jdbc:sqlite:parkir.db";
    // koneksi
    public Connection koneksi(){
        // koneksi ke database
        Connection conn = null;
        try {
            //TODO 7 : isi variable conn
            conn = DriverManager.getConnection(url);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;

    }

    public void tambahData(){
         // looping input
        //TODO 8 : buat looping input
        System.out.print("Masukan jumlah data yang akan diinput: ");
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        System.out.println("");

        // looping input
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukan plat nomor: ");
            String plat = input.next();
            System.out.println("");
            System.out.print("Masukan lama detik: ");
            int detik = input.nextInt();
            System.out.println("");

            // buatlah pembagian pembulatan keatas untuk menentukan jam
            int jam = detik / 3600;
            if (detik % 3600 != 0) {
                jam++;
            }
            int harga = jam * 2000;
            

            //TODO 9 : buat query insert
            String sql = "INSERT INTO parkir(no_plat, lama_detik, harga) VALUES(?,?,?)";
            
            try (Connection conn = koneksi();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, plat);
                pstmt.setInt(2, detik);
                pstmt.setInt(3, harga);

                // TODO 10: Buat statement
                // TODO 11: Execute statement
                pstmt.executeUpdate();

                System.out.println("Data berhasil diinput");
                System.out.println("");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
            
        }
        

    public void tampilData(){
        String sql = "SELECT * FROM parkir";

        try (Connection conn = koneksi();PreparedStatement pstmt = conn.prepareStatement(sql);ResultSet rs = pstmt.executeQuery()) {
            // TODO 14: Looping untuk menampilkan data
            System.out.println("ID\tNO PLAT\t\tLAMA\tHARGA");
            System.out.println("==============================================");

            while (rs.next()) {
                int id = rs.getInt("id_parkir");
                String plat = rs.getString("no_plat");
                int detik = rs.getInt("lama_detik");
                int harga = rs.getInt("harga");

                System.out.printf("%d\t%s         %d\t%d%n", id, plat, detik, harga);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        

    }

    public void totalPemasukan(){
         // TODO 15: Buat query select untuk menghitung total pemasukan
        String sql = "SELECT SUM(harga) AS total_pemasukan FROM parkir";

        try (Connection conn = koneksi();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            if (rs.next()) {
                int totalPemasukan = rs.getInt("total_pemasukan");

                System.out.println("Total Pemasukan: " + totalPemasukan);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }

    public void delete(){
        // TODO: Implement the delete method
        String sql = "DELETE FROM parkir";

        try (Connection conn = koneksi();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.executeUpdate();

            System.out.println("Data berhasil dihapus");
            System.out.println("");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }
}
