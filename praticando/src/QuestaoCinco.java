import java.util.Scanner;
import java.util.Locale;
public class QuestaoCinco {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);  

    System.out.println("###########################");    
    System.out.println("### SIMULADOR DE VIAGEM ###");
    System.out.println("###########################\n");

    System.out.println("Digite a velocidade média:");
    double velocidade = scanner.nextDouble();
    System.out.println("Digite o tempo do percurso:");
    double tempo = scanner.nextDouble();
    double distancia = DistanciaP(tempo, velocidade);
    double litrosUsados = LitrosUsados(tempo);

    System.out.println("### RESULTADO DA VIAGEM ###");
    System.out.println("Velocidade média: " + velocidade + "KM/h");
    System.out.println("O tempo gasto foi: " + tempo + "h");
    System.out.println("Distancia percorrida: " + distancia +"km");
    System.out.println("Litros utilizados: " + litrosUsados + " litros\n");


        
    }

    static double DistanciaP(double tempo, double velocidade){
        double distancia = tempo * velocidade;

        return distancia;
    }

    static double LitrosUsados(double distancia){
        double litrosU = 12;
        double litrosUsados = distancia / litrosU;

        return litrosUsados;
    }
}
