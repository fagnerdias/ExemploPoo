/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author f202340
 */
public class Coneccao {
    
    private final String url = "jdbc:postgresql://localhost:5432/exemplopoo";
    private final String user = "postgres";
    private final String password = "postgres";
    
    public Connection conectar() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado com sucesso ao PostgreSQL!"); 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Coneccao.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        return conn;
}
    
}
