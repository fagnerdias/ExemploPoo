/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MesaController;
import javax.swing.JOptionPane;
import model.Mesa;
import repositories.MesaRepository;

/**
 *
 * @author fagnermorais
 */
public class MesaView {
        private MesaController mesaController;
    private MesaRepository mesaRepository;
    
    public MesaView(){
        this.mesaRepository = new MesaRepository();
        this.mesaController = new MesaController(mesaRepository);
    }
    
    
    public MesaController getMesaController() {
        return mesaController;
    }

    public void setMesaController(MesaController mesaController) {
        this.mesaController = mesaController;
    }

    public MesaRepository getMesaRepository() {
        return mesaRepository;
    }

    public void setMesaRepository(MesaRepository mesaRepository) {
        this.mesaRepository = mesaRepository;
    }
    
    public void save(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero:"));
        
        Mesa mesa = new Mesa();
        mesa.setNumero(numero);
        
       this.mesaController.salvar(mesa);
        JOptionPane.showMessageDialog(null, 
                this.getMesaController().listar());
        
        
    }
    
    public void remove(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero:"));
        
        Mesa mesa = new Mesa();
        mesa.setNumero(numero);
        
        this.mesaController.remover(mesa);
    }
    
    public void list(){
        JOptionPane.showMessageDialog(null, 
                this.getMesaController().listar());
    }
}
