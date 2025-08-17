package main.model;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(String numeroConta, double saldo, String cliente) {
        super(cliente, saldo, numeroConta);

    }
}

