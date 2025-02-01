package desafioIphone.aparelho.funcoes;

public class AparelhoTelefonico {
    private void sinalOperadora(){
        System.out.println("Verificando conexão com operadora...");
    }

    public void  ligar(){
        sinalOperadora();
        System.out.println("REALIZANDO LIGAÇÃO...");
    }
    public void  atender(){

        System.out.println("Atendendo Ligação");
    }
    public void  iniciarCorreioVoz(){

        System.out.println("Aguarde um momento e grave sua mensagem...");
    }
}
