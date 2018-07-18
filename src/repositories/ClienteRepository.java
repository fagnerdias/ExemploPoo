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
public class ClienteRepository{
    
    private final List<Cliente> clientes;

    public ClienteRepository() {
        this.clientes = new ArrayList<>();
    }
    
    public void add(Cliente cliente){ 
        this.clientes.add(cliente);
    }
    
    public void remove(Cliente cliente) {
        clientes.remove(cliente);
    }
    
    public List<Cliente> listar(){
        return this.clientes;
    }
    
    public Cliente findByCPF(String cpf){
        for(Cliente aux : this.clientes){
            if(aux.getCpf().equals(cpf)){
                return aux;
            }
        }
        return null;
    }
    
}
