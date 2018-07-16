/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Pessoa;
import repositories.PessoaRepository;

/**
 *
 * @author fagnermorais
 */
public class PessoaController {
    
    private PessoaRepository pessoaRepository;
    
        
    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public void salvar(Pessoa pessoa) {
        pessoaRepository.addItem(pessoa);
    }
    
    public void remover(Pessoa pessoa) {
        pessoaRepository.removeItem(pessoa);
    }
    
    public void atualizar(Pessoa pessoaOld, Pessoa pessoaNew){
        pessoaRepository.removeItem(pessoaOld);
        pessoaRepository.addItem(pessoaNew);
    }
    
    public String listar() {
        String lista = "Lista de itens \n";
        for (Pessoa pessoa : pessoaRepository.listar()) {
            lista += pessoa + "\n";
        }
        return lista;
    }
}
