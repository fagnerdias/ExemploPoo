/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Cliente;
import repositories.ClienteRepository;

/**
 *
 * @author fagnermorais
 */
public class ClienteController {
    
    private ClienteRepository itemRepository;
    
        
    public ClienteController(ClienteRepository clienteRepository) {
        this.itemRepository = clienteRepository;
    }

    public void salvar(Cliente cliente) {
        itemRepository.addItem(cliente);
    }
    
    public void remover(Cliente cliente) {
        itemRepository.removeItem(cliente);
    }
    
    public void atualizar(Cliente Oldcliente, Cliente Newcliente){
        itemRepository.removeItem(Oldcliente);
        itemRepository.addItem(Newcliente);
    }
    
    public String listar() {
        String lista = "Lista de itens \n";
        for (Cliente cliente : itemRepository.listar()) {
            lista += cliente + "\n";
        }
        return lista;
    }
}
