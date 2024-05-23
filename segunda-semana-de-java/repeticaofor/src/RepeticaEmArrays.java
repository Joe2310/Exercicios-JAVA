public class RepeticaEmArrays {
    public static void main(String[] args) {
        String alunos [] = {"Felipe", "Joao","Joe"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x= " + x + " e " + alunos[x]);
        }
        for(String aluno : alunos){
            System.out.println("O nome do aluno e: " + aluno);
        }
    }
}
