package estruturaDados.youtube.teste;

import estruturaDados.youtube.ListaEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(10);

        System.out.println(lista);
    }
}
