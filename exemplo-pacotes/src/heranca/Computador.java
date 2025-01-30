package heranca;

import encapsulamento.MSNMessenger;

public class Computador {
    public static void main(String[] args) {
        MSNMessengerr msn = new MSNMessengerr();
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMenssenger face = new FacebookMenssenger();
        face.enviarMensagem();
        face.receberMensagem();

        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
