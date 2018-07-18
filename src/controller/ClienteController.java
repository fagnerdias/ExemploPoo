/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ClienteDao;
import model.Cliente;
import repositories.ClienteRepository;

/**
 *
 * @author fagnermorais
 */
public class ClienteController {
    
    private ClienteRepository itemRepository;
    private ClienteDao clienteDao;
    
       
    public ClienteController(){
        this.clienteDao = new ClienteDao();
    }
    
    public ClienteController(ClienteRepository clienteRepository) {
        this.itemRepository = clienteRepository;
        this.clienteDao = new ClienteDao();
       
    }

    public void salvar(Cliente cliente) {
        //itemRepository.add(cliente);
        this.clienteDao.add(cliente);
    }
    
    public void remover(Cliente cliente) {
        //itemRepository.remove(cliente);
        this.clienteDao.remove(cliente);
    }
    
    public void atualizar(Cliente Oldcliente, Cliente Newcliente){
        //itemRepository.remove(Oldcliente);
        //itemRepository.add(Newcliente);
        this.clienteDao.update(Oldcliente, Newcliente);
    }
    
    public String listar() {
        String lista = "Lista de clientes \n";
       /* for (Cliente cliente : itemRepository.listar()) {
            lista += cliente.toString() + "\n";
        }*/       
        //return lista;
        return this.clienteDao.list().toString();
    }
}
