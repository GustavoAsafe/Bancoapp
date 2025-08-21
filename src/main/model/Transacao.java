package main.model;
import java.time.LocalDateTime;

public class Transacao {
    public String tipo; // deposito, saque, transferencia
    public double valor;
    public LocalDateTime datahora;

    public Transacao(String tipo, double valor, LocalDateTime datahora) {
        this.tipo = tipo;
        this.valor = valor;
        this.datahora = datahora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getDatahora() {
        return datahora;
    }

    public void setDatahora(LocalDateTime datahora) {
        this.datahora = datahora;
    }

    @Override
    public String toString(){
        return "[" + datahora + "]" + tipo + valor;
    }

}
