public class Apresentacoes{

    public void menu(){
        System.out.println("Escolha uma opção abaixo:");
        System.out.println("1. Criar conta");
    }
    public void menuUm(){
        System.out.println("Escolha uma opção abaixo:");
        System.out.println("1. Deposito");
        System.out.println("2. Saque");
        System.out.println("3. Transferencia");
        System.out.println("4. Saldo");
        System.out.println("5. Lista de Contas");
        System.out.println("0. Sair do sistema");
    }
    public void contaCriada(){
        System.out.println("Conta criada com sucesso!");
        System.out.println("########################\n");
    }
    public void depositoContas(){
        System.out.println("Escolha a conta para deposito:");
        System.out.println("1. Corrente");
        System.out.println("2. Poupanca");
    }
    public void transferenciaC(){
        System.out.println("Escolha a conta para transferencia:");
        System.out.println("1. Corrente");
        System.out.println("2. Poupanca");
    }
    public void saqueC(){
        System.out.println("Escolha a conta para saque:");
        System.out.println("1. Corrente");
        System.out.println("2. Poupanca");
    }

}
