public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 10;

        if(nota >= 6)
        System.out.println("Aluno Aprovado");

        else if (nota >= 5 && nota < 7)
        System.out.println("Recuperação");

        else
        System.out.println("Aluno Reprovado");
    }
}
