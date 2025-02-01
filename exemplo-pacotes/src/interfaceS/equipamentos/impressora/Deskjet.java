package interfaceS.equipamentos.impressora;

import interfaceS.equipamentos.digitalizadora.Digitalizadora;

public class Deskjet implements Impressora {
    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO DESKJET");
    }
}
