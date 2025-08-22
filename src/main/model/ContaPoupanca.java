package main.model;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(String numeroConta, double saldo, String cliente) {
        super(cliente, saldo, numeroConta);

    }
}
