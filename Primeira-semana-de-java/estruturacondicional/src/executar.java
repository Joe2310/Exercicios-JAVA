import condicaoternaria.CondicaoTernaria;
import condicionaiscomposta.ResultadoEscolar;
import condicionaisencadeada.CondicionaisEncadeada;
import condicionalsimples.CondicionalSimples;

public class executar {
    public static void main(String[] args) throws Exception {
        CondicionalSimples saldo = new CondicionalSimples();
        ResultadoEscolar nota = new ResultadoEscolar();
        CondicionaisEncadeada resultado = new CondicionaisEncadeada();
        CondicaoTernaria ternaria = new CondicaoTernaria();
        
            System.out.println("CONDICIONAIS SIMPLES: UMA RESPOSTA.");
            //insira uma idade como parametro
        saldo.MaiorIdade(18);
        saldo.Saque();
        System.out.println("-------------------");
    

        System.out.println("CONDICIONAIS COMPOSTAS: CASO NAO SEJA A PRIMEIRA, SERA A SEGUNDA.");
        //insira uma nota como parametro
        nota.Nota(7.5);
        System.out.println("-------------------");
        
        
        System.out.println("CONDICIONAIS ENCADEADA: CASO NAO SEJA A PRIMEIRA, OU A SEGUNDA, SERA A TERCEIRA OU QUANTAS CONDICOES TIVER...");
        //insira uma nota como parametro
        resultado.Aprovado(10);


        //insira uma idade como parametro
        resultado.vida(20);


        System.out.println("-------------------");
        System.out.println("CONDICIONAISTERNARIA: RETORNA UM OU OUTRO.");

        ternaria.Ternaria(10);

        //insira uma idade como parametro
        ternaria.idade(18);






    }
}
