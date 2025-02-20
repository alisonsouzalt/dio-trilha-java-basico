package estruturaDados.estruturasWeb1;

public class Notas {

    private double quiz;
    private double prova;
    private double pti;

    public Notas() {
        this.quiz = 0;
        this.prova = 0;
        this.pti = 0;
    }

    public boolean setQuiz(double nota){
        if ((nota <0) || (nota > 1)){
            return false;

        }
        else{
                this.quiz = nota;
                return true;
        }
    }

    public boolean setProva(double nota){
        if ((nota <0) || (nota > 8)){
            return false;

        }
        else{
            this.prova = nota;
            return true;
        }
    }

    public boolean setPti(double nota){
        if ((nota <0) || (nota > 1)){
            return false;

        }
        else{
            this.pti = nota;
            return true;
        }
    }

    public double getQuiz() {
        return quiz;
    }

    public double getProva() {
        return prova;
    }

    public double getPti() {
        return pti;
    }

    public double getNotaFinal(){
        return prova + pti + quiz;
    }
}
