package main.controller;
import main.model.ContaBancaria;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = null; // null = n existe conta

        while(true){ //faz o menu ficar em loop
            System.out.println("======MENU DE OPÇÕES=======");
            System.out.println("1_ Criar Conta");
            System.out.println("2_ Entrar na conta");
            System.out.println("3_ Sair");
            System.out.println("Escolha uma opção");

            int opcao = new scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1 -> {
                    //Criar conta
                    System.out.println("Digite seu nome: ");
                    String  nome = scanner.nextLine();

                    System.out.println("Digite seu CPF: ");
                    String CPF = scanner.nextLine();

                    System.out.println("Digite seu E-mail");
                    String email = scanner.nextLine();

                    System.out.println("Digite seu telefone: ");
                    String telefone = scanner.nextLine();

                    // Criar objeto Cliente
                    Cliente cliente = new Cliente(nome,CPF,email,telefone);

                    // Criar objeto ContaBancaria
                    Conta = new contaBancaria("1234", 0.0, clinete);

                    System.out.println("Conta criada com sucesso");
                    System.out.println(conta);
                }
                case 2 -> {
                    //Entrar na conta
                    if(conta != null){
                        System.out.println("Bem vindo a conta" + conta.getCliente() .getNome());
                        System.out.println("Saldo atual:" + conta.getSaldo());
                    }else{
                        System.out.println("Nenhuma conta criada ainda. Crie uma conta primeiro.");
                    }
                }
                case 3 -> {
                    //sair da conta
                    System.out.println("Saindo...");
                    return;
                }
                defaul -> System.out.println("Opção invalida! Tente novamente")

            }
        }
    }
}
