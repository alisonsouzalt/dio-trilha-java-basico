import java.util.Locale;
import java.util.Scanner;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("### Extrato Conta Corrente ###");
        imprimirInfosComuns();
    }
}
