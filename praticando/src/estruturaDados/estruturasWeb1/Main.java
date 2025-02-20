package estruturaDados.estruturasWeb1;

public class Main {
    public static void main(String[] args) {

        Alunos aluno = new Alunos("Alison");
        Notas notas = new Notas();

        System.out.println(notas.setProva(8));
        System.out.println(notas.setPti(1));
        System.out.println(notas.setQuiz(1));

        if (notas.getNotaFinal() >= 6){
            System.out.println("Aluno " + aluno.getNome() + " aprovado!");
        } else{
            System.out.println("Aluno " + aluno.getNome() + " reprovado!");
        }
        System.out.println("Média final = " + notas.getNotaFinal());
    }
}
