import java.util.Scanner;
import java.util.Locale;

public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        }

        else{
            System.out.println("Seu saldo é insuficiente.");
        }

        System.out.println(saldo);
    }
}
