import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Cliente cliente = new Cliente();
        Apresentacoes ap = new Apresentacoes();
        int escolha = 0;
        String texto;
        double valor = 0;

        System.out.println("## SEJA BEM VINDO!\n");
        ap.menu();
        escolha = scanner.nextInt();
        if (escolha == 1){
            System.out.println("Digite seu nome");
            texto = scanner.next();
            cliente.setNome(texto);
            ContaCorrente cc = new ContaCorrente(cliente);
            ContaPoupanca cp = new ContaPoupanca(cliente);
            String clinteT [] = {"GERENTE", texto};
            ap.contaCriada();

            while (true){
                ap.menuUm();
                escolha = scanner.nextInt();
                if (escolha == 1) {
                    ap.depositoContas();
                    escolha = scanner.nextInt();
                    if (escolha == 1) {
                        System.out.println("Digite o valor de deposito:");
                        valor = scanner.nextDouble();
                        if (valor > 0) {
                            cc.depositar(valor);
                            System.out.println("Deposito de R$ " + valor + " realizado com sucesso\n");
                        } else {
                            System.out.println("O valor deve ser maior que 0\n");
                        }
                    } else if (escolha == 2) {
                        System.out.println("Digite o valor de deposito:");
                        valor = scanner.nextDouble();
                        if (valor > 0) {
                            cp.depositar(valor);
                            System.out.println("Deposito de R$ " + valor + " realizado com sucesso\n");
                        } else {
                            System.out.println("O valor deve ser maior que 0\n");
                        }
                    }
                }
                else if(escolha == 2){
                    ap.saqueC();
                    escolha = scanner.nextInt();
                    if (escolha == 1){
                        System.out.println("Digite o valor de saque:");
                        valor = scanner.nextDouble();
                        if (valor <= cc.saldo) {
                            cc.sacar(valor);
                            System.out.println("Saque de R$ " + valor + " realizado com sucesso\n");
                        }
                        else{
                            System.out.println("Saldo insuficiente!\n");
                        }
                    }
                    else if (escolha == 2){
                        System.out.println("Digite o valor de saque:");
                        valor = scanner.nextDouble();
                        if (valor <= cp.saldo) {
                            cp.sacar(valor);
                            System.out.println("Saque de R$ " + valor + " realizado com sucesso\n");
                        }
                        else{
                            System.out.println("Saldo insuficiente!\n");
                        }
                    }
                }
                else if (escolha == 3) {
                    ap.transferenciaC();
                    escolha = scanner.nextInt();
                    if (escolha == 1) {
                        System.out.println("Digite o valor de transferencia:");
                        valor = scanner.nextDouble();
                        if (valor < cp.saldo){
                            cp.transferir(valor, cc);
                            System.out.println("Transferencia de R$ " + valor + " realizada com sucesso\n");
                        }
                        else{
                            System.out.println("Saldo insuficiente!\n");
                        }
                    }
                    else if (escolha == 2) {
                        System.out.println("Digite o valor de transferencia:");
                        valor = scanner.nextDouble();
                        if (valor < cc.saldo) {
                            cc.transferir(valor, cp);
                            System.out.println("Transferencia de R$ " + valor + " realizada com sucesso\n");
                        }
                        else{
                            System.out.println("Saldo insuficiente!\n");
                        }
                    }
                }
                else if (escolha == 4){
                    cc.imprimirExtrato();
                    cp.imprimirExtrato();
                }
                else if (escolha == 5){
                    for (int x=1; x<clinteT.length; x++){
                        System.out.println("CLIENTE Nº: " + x + " - " + clinteT[x]+"\n");
                    }
                }
                else if (escolha == 0){
                    System.out.println("Sistema finalizado!");
                    break;
                }

            }
        }

    }
}
