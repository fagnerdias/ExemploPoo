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
    
    private final List<Pessoa> pessoas;

    public PessoaRepository() {
        pessoas = new ArrayList<>();
    }
    
    public void add(Pessoa pessoa){ 
        pessoas.add(pessoa);
    }
    
    public void remove(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }
      
    public List<Pessoa> listar(){
        return pessoas;
    }
    
    public Pessoa findByCPF(String cpf){
        for(Pessoa aux : this.pessoas){
            if(aux.getCpf().equals(cpf)){
                return aux;
            }
        }
        return null;
    } 
    
}
