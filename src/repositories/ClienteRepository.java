/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;


import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author fagnermorais
 */
public class ClienteRepository {
    
    private final List<Cliente> clientes;

    public ClienteRepository() {
        this.clientes = new ArrayList<>();
    }
    
    public void addItem(Cliente cliente){ 
        this.clientes.add(cliente);
    }
    
    public void removeItem(Cliente cliente) {
        clientes.remove(cliente);
    }
      
    public List<Cliente> listar(){
        return clientes;
    }
}
