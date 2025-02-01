package desafioIphone.aparelho.funcoes;

public class NavegadorInternet {
    public void navegar(){
        verificacaoRede();
        System.out.println("Carregando página...");
        System.out.println("Página carregada\n");
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada");
    }
    public void atualizarPagina(){
        verificacaoRede();
        System.out.println("Atualizando a página...");
        System.out.println("Página atualizada\n");
    }
    private void verificacaoRede(){
        System.out.println("Verificando conexão com a internet");
    }
}
