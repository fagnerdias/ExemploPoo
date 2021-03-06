/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Garcon;
import repositories.GarconRepository;

/**
 *
 * @author fagnermorais
 */
public class GarconController {
    
    private GarconRepository garconRepository;
    
        
    public GarconController(GarconRepository garconRepository) {
        this.garconRepository = garconRepository;
    }

    public void salvar(Garcon garcon) {
        garconRepository.add(garcon);
    }
    
    public void remover(Garcon garcon) {
        garconRepository.remove(garcon);
    }
    
    public void atualizar(Garcon garconOld, Garcon garconNew){
        garconRepository.remove(garconOld);
        garconRepository.add(garconNew);
    }
    
    public String listar() {
        String lista = "Lista de itens \n";
        for (Garcon garcon : garconRepository.listar()) {
            lista += garcon + "\n";
        }
        return lista;
    }
}
