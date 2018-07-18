/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.GarconController;
import javax.swing.JOptionPane;
import model.Garcon;
import repositories.GarconRepository;

/**
 *
 * @author fagnermorais
 */
public class GarconView {
    
        private GarconController garconController;
    private GarconRepository garconRepository;
    
    public GarconView(){
        this.garconRepository = new GarconRepository();
        this.garconController = new GarconController(garconRepository);
    }
    
    
    public GarconController getGarconController() {
        return garconController;
    }

    public void setGarconController(GarconController garconController) {
        this.garconController = garconController;
    }

    public GarconRepository getGarconRepository() {
        return garconRepository;
    }

    public void setGarconRepository(GarconRepository garconRepository) {
        this.garconRepository = garconRepository;
    }
    
    public void save(){
        String nome = JOptionPane.showInputDialog("Nome:");
        String cpf = JOptionPane.showInputDialog("CPF:");
        String endereco = JOptionPane.showInputDialog("Endereco:");
        String telefone = JOptionPane.showInputDialog("Telefone:");
        String trabalho = JOptionPane.showInputDialog("Carteira de trabalho:");
        String matricula = JOptionPane.showInputDialog("matricula:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salario:"));
        
        
        Garcon garcon = new Garcon();
        garcon.setCpf(cpf);
        garcon.setNome(nome);
        garcon.setEndereco(endereco);
        garcon.setTelefone(telefone);
        garcon.setCarteiraTrabalho(trabalho);
        garcon.setMatricula(matricula);
        garcon.setSalario(salario);
        
       
        this.getGarconController().salvar(garcon);
        JOptionPane.showMessageDialog(null, 
                this.getGarconController().listar());
        
        
    }
    
    public void remove(){
        String cpf = JOptionPane.showInputDialog("CPF:");
        Garcon garcon = new Garcon();
        garcon.setCpf(cpf);
        this.getGarconController().remover(garcon);
    }
    
    public void list(){
        
        JOptionPane.showMessageDialog(null, 
                this.getGarconController().listar());
    }
}
