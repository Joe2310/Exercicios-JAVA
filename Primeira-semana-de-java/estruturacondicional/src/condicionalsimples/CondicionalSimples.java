package condicionalsimples;

public class CondicionalSimples {
    public static void Saque() {
        double saldo = 25.5;
        double solicitacao = 20;

        if (solicitacao < saldo){
        saldo = saldo - solicitacao;
    }
    System.out.println("Saldo atual: " + saldo);
 }

    public static void MaiorIdade(int idade) {
        
        if(idade >= 18){
        System.out.println("Maior de idade");
        }    

    }
}
