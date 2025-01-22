import java.util.Scanner;
import java.util.Locale;
public class QuestaoTres {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("#### SISTEMA DE COMISSÃO ####\n");
    System.out.println("Digite seu nome:");
    String nome = scanner.next();
    System.out.println("Digite o código da peças:");
    int codigoPeca = scanner.nextInt();
    System.out.println("Digite o valor unitário da peça:");
    double valorPeca = scanner.nextDouble();
    System.out.println("Digite a quantidade vendida:");
    int quantidade = scanner.nextInt();
    System.out.println("\n");

    double comissao = ComissaoVendedor(valorPeca, quantidade);
    
    System.out.println("#### COMISSÃO DA VENDA REALIZADA ####");
    System.out.println("Vendedor: " + nome);
    System.out.println("Produto: " + codigoPeca);
    System.out.println("Valor R$: " + valorPeca);
    System.out.println("Quantidade: " + quantidade);
    System.out.printf("Sua comissão é de R$: %.2f", comissao);

    }

    static double ComissaoVendedor(double valorPeca, int quantidade){
        double comissao = valorPeca * 0.05;
        comissao = comissao * quantidade;

        return comissao;
    }
}
