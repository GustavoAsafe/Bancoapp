import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import main.model.*;
import main.controller.BancoController;

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);


    //---------instancia da ContaCLiente-------------//

        ContaCliente op = new ContaCliente();
    BancoController controller = new BancoController();

    //----------------------------------------------//

    //Lista de contas
    List<ContaBancaria> contas = new ArrayList<>();
    List<Cliente> clientes = new ArrayList<>();
    int opcao = -1;

    while(opcao != 3) {
        //Menu 1
        System.out.println("==== MENU ======");
        System.out.println("1 - Logar");
        System.out.println("2 - Cadastrar");
        System.out.println("3 - Sair");

        // Validar se é um número
        if (teclado.hasNextInt()) {
            opcao = teclado.nextInt();
            teclado.nextLine();



            switch (opcao) {
                case 1:
                    //cod metodos Login
                    System.out.println("Digite o User: ");
                    String user = teclado.next();

                    System.out.println("Digite sua senha");
                    String senha = teclado.next();

                    boolean logado = controller.login(clientes, user, email);

                    if (logado) {
                        System.out.println("Login realizado com sucesso!");

                    } else {
                        System.out.println("Usuário ou email inválidos!");
                    }

                    break;

                case 2:
                    // cod metodo Cadastro
                    System.out.println("Digite seu nome de usuario");
                    String nome = teclado.next();

                    System.out.println("Digite sua senha");
                    String Senha = teclado.next();

                    System.out.println("Digite seu CPF");
                    String CPF = teclado.next();

                    System.out.println("Digite seu telefone");
                    String telefone = teclado.next();

                    controller.novoCliente(clientes, nome, email, CPF, telefone);
                    break;


                case 3:
                    //Cod sair
                    System.out.println("Saindo...");
                    break;
            }

            boolean logado;
            if(logado = true){
                while(opcao != 6);
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Transferir");
                System.out.println("4 - Consiltar Saldo");
                System.out.println("5 - Extrato / Historico transações");
                System.out.println("6 - Voltar a tela de Login");

                switch(opcao){
                    case 1:
                        //Cod Deposito
                        break;

                    case 2:
                        //Cod Saque
                        break;

                    case 3:
                        //Cod  Transferir
                        break;

                    case 4:
                        //Cod Consultar Saldo
                        break;

                    case 5:
                        //Cod Extrato / historico
                        break;

                    case 6:
                        //Cod retornar Menu1
                        break;


                }
            }
        }
    }
}

private static String email;


