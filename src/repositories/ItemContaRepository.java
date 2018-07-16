/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import java.util.ArrayList;
import java.util.List;
import model.ItemConta;

/**
 *
 * @author fagnermorais
 */
public class ItemContaRepository {
    
    private final List<ItemConta> itensConta;

    public ItemContaRepository() {
        itensConta = new ArrayList<>();
    }
    
    public void addItemConta(ItemConta itemConta){ 
        itensConta.add(itemConta);
    }
    
    public void removeItemConta(ItemConta itemConta) {
        itensConta.remove(itemConta);
    }
      
    public List<ItemConta> listar(){
        return itensConta;
    }
}
