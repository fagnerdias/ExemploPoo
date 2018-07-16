/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import java.util.ArrayList;
import java.util.List;
import model.Conta;

/**
 *
 * @author fagnermorais
 */
public class ContaRepository {
    
    private final List<Conta> contas;

    public ContaRepository() {
        contas = new ArrayList<>();
    }
    
    public void addItem(Conta conta){ 
        contas.add(conta);
    }
    
    public void removeItem(Conta Conta) {
        contas.remove(Conta);
    }
      
    public List<Conta> listar(){
        return contas;
    }
}
