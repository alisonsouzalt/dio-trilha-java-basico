import java.util.Scanner;
import java.util.Locale;
public class QuestaoDois {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite o valor da cotação do Dolar:");
    double valorDolar = scanner.nextDouble();

    System.out.println("Digite o valor em Real que deseja converter:");
    double valorReal = scanner.nextDouble();

    double conversao = CotacaoDolar(valorDolar, valorReal);

    System.out.printf("O valor de conversão é $%.2f", conversao);

        
    }

    static double CotacaoDolar (double valorDolar, double valorReal){
        double conversao = valorReal / valorDolar;

        return conversao;
    }
}
