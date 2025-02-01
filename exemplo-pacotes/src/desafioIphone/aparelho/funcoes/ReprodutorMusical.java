package desafioIphone.aparelho.funcoes;

public class ReprodutorMusical {
    public String tocar(String musica){
        System.out.println("Sua música está tocando "+"("+musica+")...\n");
        return musica;
    }
    public void pausar(){
        System.out.println("Música pausada\n");
    }
    public void selecionarMusica(){
        System.out.println("Música selecionada");
    }
}
