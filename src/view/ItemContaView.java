/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ItemContaController;
import javax.swing.JOptionPane;
import model.ItemConta;
import repositories.ItemContaRepository;

/**
 *
 * @author fagnermorais
 */
public class ItemContaView {
    
    private ItemContaController itemContaController;
    private ItemContaRepository itemContaRepository;
    
    public ItemContaView(){
        this.itemContaRepository = new ItemContaRepository();
        this.itemContaController = new ItemContaController(itemContaRepository);
    }
    
    
    public ItemContaController getItemContaController() {
        return itemContaController;
    }

    public void setItemContaController(ItemContaController itemContaController) {
        this.itemContaController = itemContaController;
    }

    public ItemContaRepository getItemContaRepository() {
        return itemContaRepository;
    }

    public void setItemContaRepository(ItemContaRepository itemContaRepository) {
        this.itemContaRepository = itemContaRepository;
    }
    
    public void save(){
        String nome = JOptionPane.showInputDialog("Nome:");
        String cpf = JOptionPane.showInputDialog("CPF:");
        String endereco = JOptionPane.showInputDialog("Endereco:");
        String telefone = JOptionPane.showInputDialog("Telefone:");
        String credito = JOptionPane.showInputDialog("Credito:");
        
        
        ItemConta itemConta = new ItemConta();
        
        
       
        this.getItemContaController().salvar(itemConta);
        JOptionPane.showMessageDialog(null, 
                this.getItemContaController().listar());
        
        
    }
    
    public void remove(){
        String cpf = JOptionPane.showInputDialog("CPF:");
        ItemConta itemConta = new ItemConta();
        
        
        this.getItemContaController().remover(itemConta);
    }
    
    public void list(){
        
        
        JOptionPane.showMessageDialog(null, 
                this.getItemContaController().listar());
    }
}
