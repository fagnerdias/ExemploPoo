/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Conta;
import repositories.ContaRepository;

/**
 *
 * @author fagnermorais
 */
public class ContaController {
    
    private ContaRepository contaRepository;
    
        
    public ContaController(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    public void salvar(Conta conta) {
        contaRepository.addItem(conta);
    }
    
    public void remover(Conta conta) {
        contaRepository.removeItem(conta);
    }
    
    public void atualizar(Conta Oldconta, Conta Newconta){
        contaRepository.removeItem(Oldconta);
        contaRepository.addItem(Newconta);
    }
    
    public String listar() {
        String lista = "Lista de itens \n";
        for (Conta conta : contaRepository.listar()) {
            lista += conta + "\n";
        }
        return lista;
    }
    
}
