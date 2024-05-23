import java.text.NumberFormat;
import java.text.ParseException;

public class Excecao {
    public static void main(String[] args) {
        // Number valor1 = Double.valueOf("a1.75");
        // System.out.println(valor1);

            Number valor;
            try {
                valor = NumberFormat.getInstance().parse("a1.75");
                System.out.println(valor);
                
            } catch (ParseException e) {
                e.printStackTrace();
            }

    }
}
