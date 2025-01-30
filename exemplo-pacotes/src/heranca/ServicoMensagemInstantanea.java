package heranca;

public class ServicoMensagemInstantanea {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Messeger");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){

        System.out.println("Recebendo mensagem pelo MSN Messeger");
    }
    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico de mensagem");
    }
}
