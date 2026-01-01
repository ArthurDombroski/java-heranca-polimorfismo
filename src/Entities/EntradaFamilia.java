package Entities;

public non-sealed class EntradaFamilia extends Ingresso {

    private int numeroPessoas;

   

    public EntradaFamilia(double valor, boolean dublado, String nomeFilme, int numeroPessoas){
        super(valor, nomeFilme, dublado);

        this.numeroPessoas = numeroPessoas;
    }



    @Override
    public double getValorReal(){
        double total = getValor() * numeroPessoas;

        if(numeroPessoas > 3){
            total = total * 0.95;
        }

        return total;

    }


    public int getNumeroPessoas() {
        return numeroPessoas;
    }



    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }
    
}
