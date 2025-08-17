package main.controller;
import main.model.ContaBancaria;
import java.util.Scanner;
public static void main (String[] args) {

   Scanner scanner = new Scanner(System.in);

    System.out.println("======MENU DE OPÇÕES=======");
        System.out.println("1_ Criar Conta");
        System.out.println("2_ Entrar na conta");
        System.out.println("3_ Sair");

        int opcao = scanner.nextInt();

        //interface de console para cada ação
            switch(opcao) {
                case 1:
                    System.out.println("Digite seu Nome:");
                    String nome = scanner.nextLine();

                    System.out.println("Digite seu Cpf:");
                    String cpf = scanner.nextLine();

                    System.out.println("Digite seu E-mail:");
                    String email = scanner.nextLine();

                    System.out.println("Digite seu Telefone:");
                    int telefone = scanner.nextInt();

                    break;

                case 2:
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    break;

                default:
            }
    }

