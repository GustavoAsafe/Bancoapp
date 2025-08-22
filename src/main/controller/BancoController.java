package main.controller;
import main.model.Cliente;

import java.util.List;

public class BancoController{

    //cadastrar clientes e salavr em lista
    public static Cliente novoCliente(List<Cliente> clientes, String nome, String email, String CPF, String telefone){
        Cliente novo = new Cliente(nome, email, CPF, telefone);
        clientes.add(novo);
        System.out.println("Cliente cadastrado com sucesso!");
        return novo;

    }

        public boolean login(List<Cliente> clientes, String nome, String email) {
            for (Cliente c : clientes) {
                if (c.getNome().equals(nome) && c.getEmail().equals(email)) {
                    return true;
                }
            }
            return false;
        }
    }
