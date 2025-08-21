package main.model;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private String cliente;


    public ContaBancaria(String numeroConta, double saldo, String cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;

        ContaBancaria conta = new ContaBancaria("1234", 1000.00,"Gustavo");
        System.out.println(conta);
    }

    // Getters
    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCliente() {
        return cliente;
    }

    ArrayList<Transacao> transacoes;
    public ContaBancaria() {


    }

    // Depósito
    public void depositar(double valor) {
       if(valor < 0){
           this.saldo += valor;

           Transacao t = new Transacao("Depositar", valor, LocalDateTime.now());
           historico.add(t);
       }else{
           System.out.println("Valor invalido para deposito, insira um novo valor");
       }
    }

    //SAQUE
    public void sacar(double valor){
        if(valor < 0){
            this.saldo -= valor;

            Transacao t = new Transacao("Sacar", valor, LocalDateTime.now());
            historico.add(t);
        }else{
            System.out.println("Valor invalido para saque, insira um novo valor");
        }
    }



    private List<Transacao> historico;
    public ContaBancaria(List<Transacao> historico) {
        this.historico = historico;

    }

    public void exibirHistorico() {
        for (Transacao t : historico) {
            System.out.println(t);
        }
    }


}
