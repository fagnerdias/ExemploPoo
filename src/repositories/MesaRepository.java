/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import java.util.ArrayList;
import java.util.List;
import model.Mesa;

/**
 *
 * @author fagnermorais
 */
public class MesaRepository {
    
    private final List<Mesa> mesas;

    public MesaRepository() {
        mesas = new ArrayList<>();
    }
    
    public void add(Mesa mesa){ 
        mesas.add(mesa);
    }
    
    public void remove(Mesa mesa) {
        mesas.remove(mesa);
    }
      
    public List<Mesa> listar(){
        return mesas;
    }
    
    public Mesa findByNumber(int number){
        for(Mesa aux:this.mesas){
            if(aux.getNumero() == number){
                return aux;
            }
        }
        return null;
        
    }
    
}
