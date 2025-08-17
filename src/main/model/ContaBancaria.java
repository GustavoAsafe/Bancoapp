package main.model;

import java.util.Scanner;

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

    // Depósito
    public void depositar() {
        Scanner sc = new Scanner(System.in);
        double valor;

        do {
            System.out.print("Insira o valor a ser depositado: ");
            valor = sc.nextDouble();

            if (valor <= 0) {
                System.out.println("⚠ O valor deve ser maior que 0.");
            }
        } while (valor <= 0);

        saldo += valor; // soma no saldo
        System.out.println("✅ Depósito realizado com sucesso! Saldo atual: R$ " + saldo);

    }

}
