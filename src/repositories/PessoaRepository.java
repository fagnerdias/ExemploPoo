/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import java.util.ArrayList;
import java.util.List;
import model.Pessoa;

/**
 *
 * @author fagnermorais
 */
public class PessoaRepository {
    
    private final List<Pessoa> Pessoas;

    public PessoaRepository() {
        Pessoas = new ArrayList<>();
    }
    
    public void addItem(Pessoa pessoa){ 
        Pessoas.add(pessoa);
    }
    
    public void removeItem(Pessoa pessoa) {
        Pessoas.remove(pessoa);
    }
      
    public List<Pessoa> listar(){
        return Pessoas;
    }
    
}
