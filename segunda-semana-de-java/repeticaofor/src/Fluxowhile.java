import java.util.concurrent.ThreadLocalRandom;

public class Fluxowhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada > 0){
            Double valorDoce = ValorAleatorio();

            System.out.println("Valor do doce: "+ valorDoce + " adicionado no carrinho.");
            mesada = mesada - valorDoce;

            
        }
        System.out.println("Mesada : " + mesada);
        System.out.println("Joaozinho gastou toda a sua mesada em doces.");
    }

    private static Double ValorAleatorio () {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
