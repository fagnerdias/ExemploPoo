/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author fagnermorais
 */
public class Main {
    
    public static void main (String args[]){
        ContaView conta = new ContaView();
        ClienteView cliente = new ClienteView();
        GarconView garcon = new GarconView();
        ItemContaView itemConta = new ItemContaView();
        ItemView item = new ItemView();
        MesaView mesa = new MesaView();
        
        boolean loop = true; 
        /*
        opcões: 1 - cliente
                2 - item
                3 - garcon
                4 - mesa
                5 - conta
                6 - itemConta
        
        */
        while(loop){
            String opcao = JOptionPane.showInputDialog("Opção\n"+ 
"                1 - cliente\n" +
"                2 - item\n" +
"                3 - garcon\n" +
"                4 - mesa\n" +
"                5 - conta\n" +
"                6 - itemConta\n"+ 
"                7 - encerrar\n");
            
            switch(opcao){
                case "1":  // -----  CLIENTE -------
                    opcao = JOptionPane.showInputDialog("Opção\n"+ 
"                1 - adicionar\n" +
"                2 - remover\n" +
"                3 - listar\n" +
"                4 - encerrar\n"); 
                    switch(opcao){
                        case "1":
                            cliente.save();
                            break;
                        case "2":
                            cliente.remove();
                        case "3":
                            cliente.list();
                        case "4":
                            break;
                        default:
                            break;
                    }
                    break;
                case "2":  // -----  ITEM -------
                    opcao = JOptionPane.showInputDialog("Opção\n"+ 
"                1 - adicionar\n" +
"                2 - remover\n" +
"                3 - listar\n" +
"                4 - encerrar\n"); 
                    switch(opcao){
                        case "1":
                            item.save();
                            break;
                        case "2":
                            item.remove();
                        case "3":
                            item.list();
                        case "4":
                            break;
                        default:
                            break;
                    }
                    break;
                case "3": // -----  GARCON -------
                    opcao = JOptionPane.showInputDialog("Opção\n"+ 
"                1 - adicionar\n" +
"                2 - remover\n" +
"                3 - listar\n" +
"                4 - encerrar\n"); 
                    switch(opcao){
                        case "1":
                            garcon.save();
                            break;
                        case "2":
                            garcon.remove();
                        case "3":
                            garcon.list();
                        case "4":
                            break;
                        default:
                            break;
                    }
                    break;
                case "4":  // -----  MESA -------
                    opcao = JOptionPane.showInputDialog("Opção\n"+ 
"                1 - adicionar\n" +
"                2 - remover\n" +
"                3 - listar\n" +                           
"                4 - encerrar\n"); 
                    switch(opcao){
                        case "1":
                            mesa.save();
                            break;
                        case "2":
                            mesa.remove();
                        case "3":
                            mesa.list();
                        case "4":
                            break;
                        default:
                            break;
                    }
                    break;
                case "5":  // -----  CONTA -------
                    opcao = JOptionPane.showInputDialog("Opção\n"+ 
"                1 - adicionar\n" +
"                2 - remover\n" +
"                3 - listar\n" +                           
"                4 - encerrar\n"); 
                    switch(opcao){
                        case "1":
                            conta.save();
                            break;
                        case "2":
                            conta.remove();
                        case "3":
                            conta.list();
                        case "4":
                            break;
                        default:
                            break;
                    }
                    break;
                case "6":  // -----  ITEM-CONTA -------
                    opcao = JOptionPane.showInputDialog("Opção\n"+ 
"                1 - adicionar\n" +
"                2 - remover\n" +
"                3 - listar\n" +                           
"                4 - encerrar\n"); 
                    switch(opcao){
                        case "1":
                            itemConta.save();
                            break;
                        case "2":
                            itemConta.remove();
                        case "3":
                            itemConta.list();
                        case "4":
                            break;
                        default:
                            break;
                    }
                    break;
                case "7":
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }
    
}
