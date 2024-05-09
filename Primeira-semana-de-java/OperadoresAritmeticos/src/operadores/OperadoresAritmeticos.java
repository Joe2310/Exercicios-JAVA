package operadores;

import java.util.Scanner;

public class OperadoresAritmeticos{

    Scanner Scanner = new Scanner(System.in);
    public void ApresentarMensagem() {
        System.out.println("Operadores aritméticos básicos.");
       }

    public void Operadores() {
        System.out.println("Digite dois numero para verificar");
        int numero1 = Scanner.nextInt();
        int numero2 = Scanner.nextInt();
    int somar = numero1 + numero2;
    int subtrair = numero1 - numero2;
    int multiplicar = numero1 * numero2;
    int dividir = numero1 / numero2;

    System.out.println("O operador + tem a função de somar: " + numero1 + " + " + numero2 + " = " + somar);
    System.out.println("O operador - tem a função de subtrair : " + numero1 + " - " + numero2 + " = " +  subtrair);
    System.out.println("O operador * tem a função de multiplicar : " + numero1 + " * " + numero2 + " = " + multiplicar);
    System.out.println("O operador / tem a função de dividir : " + numero1 + " / " + numero2 + " = " + dividir);
    }


    public void SaidaAritmetica() {
        ApresentarMensagem();
        Operadores();
        System.out.println("----------------------------------------------------------------");
    }
}
