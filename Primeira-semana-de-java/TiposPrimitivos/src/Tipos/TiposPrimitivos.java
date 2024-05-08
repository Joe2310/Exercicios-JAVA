package Tipos;

public class TiposPrimitivos {

   public void ApresentarMensagemTiposPrimitivos() {
    System.out.println("Olá, irei apresentar alguns  exemplos de tipos primitivos  na linguagem JAVA.");
   }

   public void TiposNumericos() {
      boolean nome = true;
      System.out.println("Tipo boolean: verdadeiro ou falso : " + nome);


      //char numeroPequeno = 65535;
      System.out.println("Tipo char: de 0 á 65535");

      byte idade = 12;
      System.out.println("Tipo byte: idade " + idade);

      short ano = 2024;
      System.out.println("Tipo short: ano " + ano);

      int cep = 40000000;
      System.out.println("Tipo int: cep " + cep);

      final long CPF = 32145678991L;
      System.out.println("Tipo final long: Cpf " + CPF);

      final float PI = 3.14F; // FINAL: indica que não podera mudar seu valor, é uma variavel que nunca tera seu valor modificado.
      System.out.println("Tipo final float: Pi " + PI);

      double salarioMinimo = 2500.55; // convensão AMERICANA
      System.out.println("Tipo double: Salario minimo " + salarioMinimo);
   }
   public void saidaTipos() {
      ApresentarMensagemTiposPrimitivos();
      TiposNumericos();
      System.out.println("----------------------------------------------------------------");

   }
            
}
