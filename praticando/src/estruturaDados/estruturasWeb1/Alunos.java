package estruturaDados.estruturasWeb1;

public class Alunos {

    private String nome;
    private Notas notas;

    public Alunos(String nome) {
        this.nome = nome;
        notas = new Notas();
        notas.setPti(0);
        notas.setProva(0);
        notas.setQuiz(0);
    }

    public String getNome() {
        return this.nome;
    }

    public boolean setNotas(double pti, double prova, double quiz){
        if (notas.setPti(pti) && notas.setProva(prova) && notas.setQuiz(quiz)){
            return true;
        } else{
            return false;
        }
    }

    public boolean setProva(double prova){
        if (notas.setProva(prova)){
            return true;
        } else {
            return false;
          }
    }

    public double getProva(){
        return notas.getProva();
    }
}
