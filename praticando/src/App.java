import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Calculadora calc = new Calculadora();

        while (true) {
    
            System.out.println("Digite a primeira nota do aluno:");
            double nota1 = scanner.nextDouble();
            System.out.println("Digite a segunda nota do aluno:");
            double nota2 = scanner.nextDouble();
            System.out.println("Digite a terceira nota do aluno:");
            double nota3 = scanner.nextDouble();
            double media = calc.NotaAluno(nota1, nota2, nota3);

            if(media >=7){
                System.out.printf("APROVADO COM MÉDIA: %.1f " , media);
                System.out.println();
            }
            else if(media >=5 && media <=7){
                System.out.printf("RECUPERAÇÃO COM MÉDIA: %.1f " , media);
                System.out.println();
                System.out.println("Informe a nova nota do aluno:");
                double novaNota = scanner.nextDouble();
                    if(novaNota>=7){
                        System.out.println("ALUNO APROVADO NA RECUPERAÇÃO!");
                    }
                    else{
                        System.out.println("ALUNO REPROVADO NA RECUPERAÇÃO!");
                    }
            }
            else{
                System.out.printf("REPROVADO COM MÉDIA: %.1f " , media);
                System.out.println();
            }
        
        }
    }

}
