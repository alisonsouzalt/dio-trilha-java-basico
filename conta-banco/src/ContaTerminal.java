import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        /*
         * Foi solicitado para desenvolver um projeto de um sistema bancário no qual
         * o usuário insira alguns dados e para isso usamos o Scanner como uma das
         * ferramentas.
         */
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //====== Abaixo está as entradas do Projeto. ======

        System.out.println("Olá, seja bem vindo ao Sistema Bancário");
        System.out.println("Para realizar seu cadastro, vamos precisar de alguns dados!");
        System.out.println();

        System.out.println("Digite o número da Conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite o numero da Agência:");
        String agencia = scanner.next();

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite o saldo que deseja abrir sua conta:");
        Double saldo = scanner.nextDouble();
        System.out.println();


        //====== Abaixo está a saida do Projeto. ======

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$ " + 
        new DecimalFormat(".##").format(saldo) + " já está disponível para saque.");
    }
}
