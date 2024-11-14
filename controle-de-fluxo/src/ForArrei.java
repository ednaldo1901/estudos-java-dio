public class ForArrei {
    public static void main(String[] args) {
        String alunos[] = {"João", "Felipe", "Pedro", "Maria"};

        for(int x = 0; x < alunos.length; x++)
        System.out.println("Aluno no index X " + x + " É " + alunos[x]);

        for(String aluno: alunos){
            System.out.println("o nome do aluno é: " + aluno);
        }
    }
}
