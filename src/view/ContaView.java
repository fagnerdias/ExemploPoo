/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ContaController;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Conta;
import model.Garcon;
import model.Item;
import model.ItemConta;
import model.Mesa;
import repositories.ClienteRepository;
import repositories.ContaRepository;
import repositories.GarconRepository;
import repositories.ItemRepository;
import repositories.MesaRepository;

/**
 *
 * @author f202340
 */
public class ContaView {

    private ContaController contaController;
    private ContaRepository contaRepository;

    public ContaView() {
        this.contaRepository = new ContaRepository();
        this.contaController = new ContaController(contaRepository);
    }

    public ContaController getContaController() {
        return contaController;
    }

    public void setContaController(ContaController contaController) {
        this.contaController = contaController;
    }

    public ContaRepository getContaRepository() {
        return contaRepository;
    }

    public void setContaRepository(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    /*
    metodo para abrir uma conta no bar
     */
    public void save() {

        String clienteCPF = JOptionPane.showInputDialog("CPF do cliente:");
        String garconCPF = JOptionPane.showInputDialog("CPF do garcon:");
        int number = Integer.parseInt(JOptionPane.showInputDialog("Numero da mesa:"));

        ClienteRepository clienteServ = new ClienteRepository();
        GarconRepository garconServ = new GarconRepository();
        Cliente cliente = new Cliente();
        cliente = clienteServ.findByCPF(clienteCPF);
        Garcon garcon = new Garcon();
        garcon = garconServ.findByCPF(garconCPF);

        MesaRepository mesaServ = new MesaRepository();
        Mesa mesa = mesaServ.findByNumber(number);

        Conta conta = new Conta();
        conta.setCliente(cliente);
        conta.setGarcon((Garcon) garcon);
        conta.setMesa(mesa);
        this.contaController.salvar(conta);

    }

    public void addItemConta() {
        Conta c = new Conta();
        int number = Integer.parseInt(JOptionPane.showInputDialog("Numero da mesa:"));
        MesaRepository mesaServ = new MesaRepository();
        Mesa mesa = mesaServ.findByNumber(number);
        c.setMesa(mesa);
        Conta conta = this.contaRepository.find(c);

        String item = JOptionPane.showInputDialog("Marca do Item:");
        ItemRepository itemServ = new ItemRepository();
        Item aux = new Item();
        aux.setMarca(item);
        aux = itemServ.find(aux);

        int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantidade:"));

        ItemConta itemConta = new ItemConta();

        itemConta.setConta(conta);
        itemConta.setItem(aux);
        itemConta.setQuantidade(qnt);

        conta.getItens().add(itemConta);
        this.contaController.atualizar(conta, conta);

    }

    /*
    metodo para fechar uma conta no bar 
     */
    public void remove() {
        
        Conta c = new Conta();
        int number = Integer.parseInt(JOptionPane.showInputDialog("Numero da mesa:"));
        MesaRepository mesaServ = new MesaRepository();
        Mesa mesa = mesaServ.findByNumber(number);
        c.setMesa(mesa);
        Conta conta = this.contaRepository.find(c);
        this.contaController.remover(conta);

    }

    /*
    metodo para listar a conta do cliente
     */
    public void list() {
        
        JOptionPane.showMessageDialog(null, 
                this.getContaController().listar());

    }
}
