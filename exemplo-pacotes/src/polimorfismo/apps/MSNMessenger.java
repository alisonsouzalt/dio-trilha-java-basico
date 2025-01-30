package polimorfismo.apps;

public class MSNMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Messeger");
    }

    @Override
    public void receberMensagem() {

        System.out.println("Recebendo mensagem pelo MSN Messeger");
    }
}
