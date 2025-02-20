package estruturaDados.youtube.teste;

import estruturaDados.youtube.ListaEncadeada;

public class ListaEncandeada<T> {
    private No<T> inicio;

    public void adicionar(T elemento){
        No<T> no = new No<T>(elemento);
        this.inicio = no;
    }
}
