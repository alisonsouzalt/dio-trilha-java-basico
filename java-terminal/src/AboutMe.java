import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {

        //Digitação de dados

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();


        //Importação dos dados Digitados

        System.out.println("Meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");
    }
}
