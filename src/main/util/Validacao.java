package main.util;
import main.model.ContaCliente;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Validacao {


public class ValidacaoEmail {
    public static boolean validarEmail(String email) {

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public class ValidaçãoConta{
        public static boolean autenticar(ContaCliente conta, String usuario, String senha) {
            return conta.getUser().equals(usuario) && conta.getSenha().equals(senha);

            }

        }

    }
}


