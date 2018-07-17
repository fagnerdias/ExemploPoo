/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ContaController;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Conta;
import model.Garcon;
import model.Mesa;
import model.Pessoa;
import repositories.ClienteRepository;
import repositories.ContaRepository;
import repositories.MesaRepository;
import repositories.PessoaRepository;

/**
 *
 * @author f202340
 */
public class ContaView {
     private ContaController contaController;
    private ContaRepository contaRepository;
    
    public ContaView(){
        this.contaRepository = new ContaRepository();
        this.contaController = new ContaController(contaRepository);
    }
    
    
    public ContaController getContaController() {
        return contaController;
    }

    public void setContaController(ContaController contaController) {
        this.contaController = contaController;
    }

    public ContaRepository getContaRepository() {
        return contaRepository;
    }

    public void setContaRepository(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }
    
    
    /*
    metodo para abrir uma conta no bar
    */
    public static void save(){
        
        String clienteCPF = JOptionPane.showInputDialog("CPF do cliente:");
        String garconCPF = JOptionPane.showInputDialog("CPF do garcon:");
        int number = Integer.parseInt(JOptionPane.showInputDialog("Numero da mesa:"));
        
        PessoaRepository pessoaServ = new PessoaRepository();
        Pessoa cliente = new Cliente();
        cliente = pessoaServ.findByCPF(clienteCPF);
        Pessoa garcon = new Garcon();
        garcon = pessoaServ.findByCPF(garconCPF);
        
        MesaRepository mesaServ = new MesaRepository();
        Mesa mesa = mesaServ.findByNumber(number);
        
        Conta conta = new Conta();
        conta.setCliente(cliente);
        conta.setGarcon(garcon);
        conta.setMesa(mesa);
               
    }
    
    /*
    metodo para fechar uma conta no bar 
    */
    public static void remove(){
        
    }
    
    /*
    metodo para listar a conta do cliente
    */
    public static void list(){
        
    }
}
