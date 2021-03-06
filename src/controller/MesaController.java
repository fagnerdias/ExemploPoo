/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Mesa;
import repositories.MesaRepository;

/**
 *
 * @author fagnermorais
 */
public class MesaController {
    
    private MesaRepository mesaRepository;
    
        
    public MesaController(MesaRepository mesaRepository) {
        this.mesaRepository = mesaRepository;
    }

    public void salvar(Mesa mesa) {
        mesaRepository.add(mesa);
    }
    
    public void remover(Mesa mesa) {
        mesaRepository.remove(mesa);
    }
    
    public void atualizar(Mesa mesaOld, Mesa mesaNew){
        mesaRepository.remove(mesaOld);
        mesaRepository.add(mesaNew);
    }
    
    public String listar() {
        String lista = "Lista de itens \n";
        for (Mesa mesa : mesaRepository.listar()) {
            lista += mesa + "\n";
        }
        return lista;
    }
}
