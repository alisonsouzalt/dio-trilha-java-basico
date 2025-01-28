package lanchonete;

public class Estabelecimento {
    public static void main(String[] args) {
    Cozinheiro cozinheiro = new Cozinheiro();
        //ações que não precisam estarem disponíveis para toda aplicação.
        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();

        //ações que estabelecimento precisa ter ciência.
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();

    Almoxarife almoxarife = new Almoxarife();
        //ações que não precisam estarem disponíveis para toda aplicação.
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();
        //ações que somente o seu pacote cozinha precisa conhecer (default)
        almoxarife.entregarIngredientes();
        almoxarife.trocarGas();

    Atendente atendente = new Atendente();
        atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        //ação que somente o seu pacote cozinha precisa conhecer (default)
        atendente.trocarGas();

    Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
    }
        
}
