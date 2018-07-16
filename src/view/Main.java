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
                case "1":
                    String opcao2 = JOptionPane.showInputDialog("Opção\n"+ 
"                1 - adicionar\n" +
"                2 - remover\n" +
"                3 - listar\n" +
"                4 - encerrar\n"); 
                    switch(opcao2){
                        case "1":
                            ClienteView.save();
                            break;
                        case "2":
                            ClienteView.remove();
                        case "3":
                            ClienteView.list();
                        case "4":
                            break;
                        default:
                            break;
                    }
                    break;
                case "2":
                    String opcao3 = JOptionPane.showInputDialog("Opção\n"+ 
"                1 - adicionar\n" +
"                2 - remover\n" +
"                3 - listar\n" +
"                4 - encerrar\n"); 
                    switch(opcao3){
                        case "1":
                            ItemView.save();
                            break;
                        case "2":
                            ItemView.remove();
                        case "3":
                            ItemView.list();
                        case "4":
                            break;
                        default:
                            break;
                    }
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
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
