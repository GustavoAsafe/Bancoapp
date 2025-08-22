package main.model;

public class ContaCliente {
    private String User;
    private String Senha;
    private Cliente cliente; //LIGAÇÃO COM A CLASSE CLIENTE

    public ContaCliente(String user, String senha, Cliente cliente) {
        this.User = user;
        this.Senha = senha;
        this.cliente = cliente;
    }

    public ContaCliente() {

    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
