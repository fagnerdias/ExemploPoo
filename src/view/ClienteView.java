/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteController;
import javax.swing.JOptionPane;
import model.Cliente;
import repositories.ClienteRepository;

/**
 *
 * @author fagnermorais
 */
public class ClienteView {
    
    private ClienteController clienteController;
    private ClienteRepository clienteRepository;
    
    public ClienteView(){
        this.clienteRepository = new ClienteRepository();
        this.clienteController = new ClienteController(clienteRepository);
    }
    
    
    public ClienteController getClienteController() {
        return clienteController;
    }

    public void setClienteController(ClienteController clienteController) {
        this.clienteController = clienteController;
    }

    public ClienteRepository getClienteRepository() {
        return clienteRepository;
    }

    public void setClienteRepository(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    
    public void save(){
        String nome = JOptionPane.showInputDialog("Nome:");
        String cpf = JOptionPane.showInputDialog("CPF:");
        String endereco = JOptionPane.showInputDialog("Endereco:");
        String telefone = JOptionPane.showInputDialog("Telefone:");
        String credito = JOptionPane.showInputDialog("Credito:");
        
        
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        cliente.setNome(nome);
        cliente.setEndereco(endereco);
        cliente.setTelefone(telefone);
        cliente.setCartaoFidelidade(nome);
        cliente.setCredito(credito);
        
       
        
        this.clienteController.salvar(cliente);
        
        JOptionPane.showMessageDialog(null, 
                this.getClienteController().listar());
        
        
        
    }
    
    public void remove(){
        String cpf = JOptionPane.showInputDialog("CPF:");
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        
        this.getClienteController().remover(cliente);
    }
    
    public void list(){
        
        
        JOptionPane.showMessageDialog(null, 
                this.getClienteController().listar());
    }
          
}
          

