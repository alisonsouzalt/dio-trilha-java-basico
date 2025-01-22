import java.util.Scanner;
import java.util.Locale;
public class QuestaoUm {
    public static void main(String[] args) {
        // 1) Faça um programa para calcular o estoque médio de uma peça, sendo que:
        // ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2. 

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //Estoque estoque = new Estoque();
        
        System.out.println("Digite a quantidade minima do estoque");
        double quantidadeMinima = scanner.nextDouble();

        System.out.println("Digite a quantidade maxima do estoque");
        double QuantidadeMaxima = scanner.nextDouble();

        double estoqueMedio = EstoqueMedio(quantidadeMinima, QuantidadeMaxima);

        System.out.printf("O estoque médio é: %.2f", estoqueMedio);

    }

    static double EstoqueMedio(double quantidadeMinima, double QuantidadeMaxima){
        double estoqueMedio = (quantidadeMinima + QuantidadeMaxima)/2;

        return estoqueMedio;
    }

}
