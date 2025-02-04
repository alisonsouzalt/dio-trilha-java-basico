import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(List<Conta> contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void imprimirContas() {
        System.out.println("\nLista de Contas do Banco " + nome + ":");
        for (Conta conta : contas) {
          System.out.println(conta + nome);
        }
    }
}
