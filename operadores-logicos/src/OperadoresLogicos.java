import java.sql.Date;

public class OperadoresLogicos {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String meuNome = "Ednaldo";
        int idade = 23;
        double peeso = 68.50;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date(2024);


        double soma = 10.14 + 20.16;
        int subtracao = 124 - 16;
        int multiplicacao = 7 * idade;
        int divisao = 125 / 5; // divisao
        int modulo = 124 % 2; //resto da divisao
        int resultado = (int) ((subtracao * divisao) + (idade / soma));
        System.out.print(resultado);
    }
}
