/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;

/**
 *
 * @author f202340
 */
public class ClienteDao {
    
    private final Coneccao db;
    
    public ClienteDao(){
        db = new Coneccao();
        
        
        String sql = "create table cliente(" +
            " id          SERIAL         PRIMARY KEY," +
            " nome        VARCHAR(250)   NOT NULL," +
            " cpf         VARCHAR(250)   NOT NULL," +
            " endereco    VARCHAR(250)   NOT NULL," +
            " telefone    VARCHAR(250)   NOT NULL," +
            " cartaofid   VARCHAR(250)   NOT NULL," +
            " credito     VARCHAR(250)   NOT NULL);";
        
        try(Connection conn = db.conectar();
                Statement stmt = conn.createStatement();) {
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    public void add(Cliente cliente){
        
        try(Connection conn = db.conectar();
                Statement stmt = conn.createStatement();){
            conn.setAutoCommit(false);
            String sql = "INSERT INTO CLIENTE (nome,cpf,endereco,telefone,cartaofid,credito) "
            + "VALUES (" +"'" + cliente.getNome() +"'"  + 
                    "," +"'" + cliente.getCpf() +"'"  + 
                    "," +"'" + cliente.getEndereco() +"'"  + 
                    "," +"'" + cliente.getTelefone() +"'"  + 
                    "," +"'" + cliente.getCartaoFidelidade() +"'" + 
                    "," +"'" + cliente.getCredito() +"'" + ");";
            System.out.println(sql);
         stmt.executeUpdate(sql);
         
         stmt.close();
         conn.commit();
         conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void remove(Cliente cliente){
        try(Connection conn = db.conectar();
                Statement stmt = conn.createStatement();){
            conn.setAutoCommit(false);
            String sql = "DELETE from cliente where cpf =" +"'" + cliente.getCpf() +"'" + ";";
         stmt.executeUpdate(sql);
         stmt.close();
         conn.commit();
         conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(Cliente clienteOLD, Cliente clienteNEW){
        try{
            this.remove(clienteOLD);
            this.add(clienteNEW);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public List<Cliente> list(){
        try(Connection conn = db.conectar();
                Statement stmt = conn.createStatement();){
            conn.setAutoCommit(false);
            ResultSet rs = stmt.executeQuery( "SELECT * FROM cliente;" );
            List<Cliente> clientes = new ArrayList<>();
            while(rs.next()){
                String id = rs.getString("id");
                System.out.println("-----------------"+id);
                Cliente c = new Cliente();
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String endereco = rs.getString("endereco");
                String telefone = rs.getString("telefone");
                String ca = rs.getString("cartaofid");
                String cre = rs.getString("credito");
                c.setId(Integer.parseInt(id));
                c.setNome(nome);
                c.setCpf(cpf);
                c.setEndereco(endereco);
                c.setTelefone(telefone);
                c.setCartaoFidelidade(ca);
                c.setCredito(cre);
                clientes.add(c);
            }
            stmt.close();
            conn.commit();
            conn.close();
            return clientes;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
