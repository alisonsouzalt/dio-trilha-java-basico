package abstracao;

public class Computador {
    public static void main(String[] args) {
        MSNMessengerr msn = new MSNMessengerr();
        msn.enviarMensagem();
        msn.receberMensagem();
        System.out.println("========================\n");

        FacebookMenssenger face = new FacebookMenssenger();
        face.enviarMensagem();
        face.receberMensagem();
        System.out.println("========================\n");

        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
        System.out.println("========================\n");
    }
}
