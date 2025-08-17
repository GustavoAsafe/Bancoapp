package main.model;

public class ContaPoupança extends ContaBancaria{
    public ContaPoupança(String numeroConta, double saldo, String cliente) {
        super(cliente, saldo, numeroConta);

    }
}
