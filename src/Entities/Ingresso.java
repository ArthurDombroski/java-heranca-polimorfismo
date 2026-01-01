package Entities;

public sealed abstract class Ingresso permits EntradaFamilia, MeiaEntrada {

    protected double valor;
    protected String nomeFilme;
    protected boolean dublado; //true = dublado , false = legendado


    public Ingresso (double valor, String nomeFilme, boolean dublado){
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.dublado = dublado;
    }

    public double getValor() {
        return valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public boolean isDublado() {
        return dublado;
    }

    public abstract double getValorReal();

    public String tipoAudio() {
        return dublado ? "Dublado" : "Legendado";
    }

    
}
