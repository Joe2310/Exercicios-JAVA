package formatarcep;
public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = FormatarCep("12123123");
                System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    static String FormatarCep(String cep) throws CepInvalidoException{

        if(cep.length() != 8)
            throw new CepInvalidoException();

            return "123.123-123";
        
    }




}
