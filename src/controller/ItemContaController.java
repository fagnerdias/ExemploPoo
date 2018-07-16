/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.ItemConta;
import repositories.ItemContaRepository;

/**
 *
 * @author fagnermorais
 */
public class ItemContaController {
    
    private ItemContaRepository itemContaRepository;
    
    public ItemContaController(ItemContaRepository itemContaRepository) {
        this.itemContaRepository = itemContaRepository;
    }

    public void salvar(ItemConta itemConta) {
        itemContaRepository.addItemConta(itemConta);
    }
    
    public void remover(ItemConta itemConta) {
        itemContaRepository.removeItemConta(itemConta);
    }
    
    public void atualizar(ItemConta itemContaOld, ItemConta itemContaNew){
        itemContaRepository.removeItemConta(itemContaOld);
        itemContaRepository.addItemConta(itemContaNew);
    }
    
    public String listar() {
        String lista = "Lista de itens \n";
        for (ItemConta item : itemContaRepository.listar()) {
            lista += item + "\n";
        }
        return lista;
    }
}
