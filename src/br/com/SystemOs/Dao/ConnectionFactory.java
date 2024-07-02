/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.SystemOs.Dao;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class ConnectionFactory {
    public static Connection getConncetion(){
        java.sql.Connection cnx = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/System_os_j";
        String user = "kelis";
        String password = "a91521425";
        try {
            Class.forName(driver);
            cnx = DriverManager.getConnection(url, user, password);
            return cnx;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
    }
}
