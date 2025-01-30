package pilaresPoo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.ligar();
        jeep.setChassi("34653");

        Moto z400 = new Moto();
        z400.ligar();
        z400.setChassi("54646");

        Veiculo coringa = jeep;

        coringa.ligar();

    }
}
