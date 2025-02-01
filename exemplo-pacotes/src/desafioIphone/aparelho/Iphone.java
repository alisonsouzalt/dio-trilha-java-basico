package desafioIphone.aparelho;

import java.util.Locale;
import java.util.Scanner;
import desafioIphone.aparelho.funcoes.AparelhoTelefonico;
import desafioIphone.aparelho.funcoes.NavegadorInternet;
import desafioIphone.aparelho.funcoes.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) {
        /// IMPORTAÇÕES
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        AparelhoTelefonico ap = new AparelhoTelefonico();
        NavegadorInternet nav = new NavegadorInternet();
        ReprodutorMusical rep = new ReprodutorMusical();

        /// SELEÇÃO DE FUNCÇOES
        System.out.println("## LIGANDO APARELHO...##");
        System.out.println("## APARELHO LIGADO ##\n");
        System.out.println("Escolha uma função abaixo:");
        System.out.println("1. Sistema Telefonico");
        System.out.println("2. Navegar na Internet");
        System.out.println("3. Reproduzir Música");

        int escolha = scanner.nextInt();
        String numero;
        String pagina;
        String musica;

        if(escolha == 1){
            System.out.println("Escolha uma função abaixo:");
            System.out.println("1. Realiza Ligação");
            System.out.println("2. Atender Ligação");
            escolha = scanner.nextInt();
                if (escolha == 1){
                    System.out.println("Digite o número telefonico:");
                    numero = scanner.next();
                    ap.ligar();
                }
                else if (escolha == 2) {
                    System.out.println("Atendendo Ligação");
                }
        }
        else if (escolha == 2){
            System.out.println("Escolha uma função abaixo:");
            System.out.println("1. Exibir página");
            escolha = scanner.nextInt();
                if (escolha == 1){
                    System.out.println("Digite a página que deseja acessar:");
                    pagina = scanner.next();
                    nav.navegar();
                    while (true) {
                        System.out.println("####################");
                        System.out.println("1. Adiconar nova aba");
                        System.out.println("2. Atualizar página");
                        System.out.println("0. Para sair do sistema");
                        escolha = scanner.nextInt();

                        if(escolha == 1){
                            System.out.println("Digite a página que deseja acessar:");
                            pagina = scanner.next();
                            nav.navegar();
                        }
                        else if (escolha == 2) {
                            nav.atualizarPagina();
                        }
                        else if (escolha == 0) {
                            System.out.println("## Finalizando sistema... ##");
                            System.out.println("## Sistema finalizado ##");
                            break;
                        }
                    }
                }
        }
        else if (escolha == 3){
            System.out.println("Escolha uma função abaixo:");
            System.out.println("1. Selecionar música");
            escolha = scanner.nextInt();
            if (escolha == 1){
                System.out.println("Digite o nome da música");
                musica = scanner.next();
                rep.selecionarMusica();
                rep.tocar(musica);
                while (true) {
                    System.out.println("####################");
                    System.out.println("1. Pausar");
                    System.out.println("2. Selecionar outra música");
                    System.out.println("0. Para sair do sistema");
                    escolha = scanner.nextInt();
                    if(escolha == 1){
                        System.out.println("Música pausada");
                        System.out.println("1. Voltar a reprodução");
                        escolha = scanner.nextInt();
                        if (escolha == 1) {
                            System.out.println("Sua música voltou a tocar\n");
                        }
                    }
                    else if (escolha == 2) {
                        System.out.println("Digite o nome da música");
                        musica = scanner.next();
                        rep.selecionarMusica();
                        rep.tocar(musica);
                    }
                    else if (escolha == 0) {
                        System.out.println("## Finalizando sistema... ##");
                        System.out.println("## Sistema finalizado ##");
                        break;
                    }
                }
            }

        }
        else{
            System.out.println("Você não escolheu nenhuma das opções!");
            System.out.println("## Finalizando sistema... ##");
            System.out.println("## Sistema finalizado ##");
        }

    }

}
