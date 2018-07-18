/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author itamir.filho
 */
public class Conta {
   
    private int id;
    
    private List<ItemConta> itens;
    
    private Garcon garcon;
    
    private Cliente cliente;
    
    private Mesa mesa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ItemConta> getItens() {
        return itens;
    }

    public void setItens(List<ItemConta> itens) {
        this.itens = itens;
    }

    public Garcon getGarcon() {
        return garcon;
    }

    public void setGarcon(Garcon garcon) {
        this.garcon = garcon;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
   
    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conta other = (Conta) obj;
        if (!Objects.equals(this.mesa, other.mesa)) {
            return false;
        }
        return true;
    }
    
    public String toString(){
        double total = 0;
        for(ItemConta i: this.getItens()){
            total += i.getItem().getValor();
        }
        if(this.itens != null){
            return this.getCliente() + "\n" + this.getGarcon() +"\n"+ this.getMesa() +"\n" + this.getItens() +"\n" + "Total:" + total;
        }
        else
            return this.getCliente() + "\n" + this.getGarcon() +"\n"+ this.getMesa() +"\n" + "Total:" + total;
    }
}
