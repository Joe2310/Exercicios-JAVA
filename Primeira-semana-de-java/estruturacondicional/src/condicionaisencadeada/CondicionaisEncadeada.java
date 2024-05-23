package condicionaisencadeada;

public class CondicionaisEncadeada {
    public static void Aprovado(double aluno) {
        
        if (aluno >=7){
            System.out.println("Aprovado");
        }else if (aluno >= 5 ){
            System.out.println("Recuparação");
        }else {
            System.out.println("Reprovado");
        }
    }

    public static void vida(int idade) {
        if(idade <=17){
            System.out.println("Jovem");
        }else if (idade <=64){
            System.out.println("Adulto");
        }else {
            System.out.println("Idoso");
        }

    }
}
