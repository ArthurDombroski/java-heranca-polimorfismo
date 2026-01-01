import Entities.MeiaEntrada;
import Entities.EntradaFamilia;
import Entities.Ingresso;

public class App {
    public static void main(String[] args) throws Exception {
        Ingresso i1 = new MeiaEntrada(40.0 , "Vingadores", true);
        Ingresso i2 = new EntradaFamilia(40.0 , true, "Vingadores", 4);

        printIngressos(i1);
        printIngressos(i2);

    }

    public static void printIngressos(Ingresso ingresso){
        switch (ingresso) {
            case MeiaEntrada i1:
                System.out.println("==================================");
                System.out.println(i1.getClass().getCanonicalName());
                System.out.println("Nome do Filme: " + i1.getNomeFilme());
                System.out.println("Preço: " + i1.getValorReal());
                System.out.println("Dublado: " + i1.tipoAudio());
                break;

            case EntradaFamilia i2:
                System.out.println("==================================");
                System.out.println(i2.getClass().getCanonicalName());
                System.out.println("Nome do Filme: " + i2.getNomeFilme());
                System.out.println("Preço: " + i2.getValorReal());
                System.out.println("Dublado: " + i2.tipoAudio());
                System.out.println("Número de pessoas: " + i2.getNumeroPessoas());
                break;

        
            
        }
    }
}
