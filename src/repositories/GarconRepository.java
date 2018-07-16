/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import java.util.ArrayList;
import java.util.List;
import model.Garcon;

/**
 *
 * @author fagnermorais
 */
public class GarconRepository {
    
    private final List<Garcon> garcons;

    public GarconRepository() {
        garcons = new ArrayList<>();
    }
    
    public void addItem(Garcon garcon){ 
        garcons.add(garcon);
    }
    
    public void removeItem(Garcon garcon) {
        garcons.remove(garcon);
    }
      
    public List<Garcon> listar(){
        return garcons;
    }
    
}
