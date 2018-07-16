/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import java.util.ArrayList;
import java.util.List;
import model.Item;

/**
 *
 * @author itamir.filho
 */
public class ItemRepository {
    
    private final List<Item> itens;

    public ItemRepository() {
        itens = new ArrayList<>();
    }
    
    public void addItem(Item item){ 
        itens.add(item);
    }
    
    public void removeItem(Item item) {
        itens.remove(item);
    }
      
    public List<Item> listar(){
        return itens;
    }
}
