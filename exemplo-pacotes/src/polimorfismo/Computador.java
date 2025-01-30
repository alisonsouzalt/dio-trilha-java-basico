package polimorfismo;

import polimorfismo.apps.FacebookMessenger;
import polimorfismo.apps.MSNMessenger;
import polimorfismo.apps.ServicoMensagemInstantanea;
import polimorfismo.apps.Telegram;

public class Computador {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        if (appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        }
        else if (appEscolhido.equals("face")) {
            smi = new FacebookMessenger();
        }
        else if (appEscolhido.equals("telegram")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
