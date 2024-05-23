package condicaoternaria;

public class CondicaoTernaria {
    public static  void Ternaria(int aluno) {
        String resultado = aluno >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
    public static void idade(int idade) {
        String resultado = idade >= 18 ? "Maior de idade" : "Menor de idade.";
        System.out.println(resultado);
    }
}
