package interfaceS.estabelecimento;

import interfaceS.equipamentos.copiadora.Copiadora;
import interfaceS.equipamentos.digitalizadora.Digitalizadora;
import interfaceS.equipamentos.digitalizadora.Scanner;
import interfaceS.equipamentos.impressora.Deskjet;
import interfaceS.equipamentos.impressora.Impressora;
import interfaceS.equipamentos.impressora.Laserjet;
import interfaceS.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Scanner scanner= new Scanner();

        Digitalizadora digitalizadora = scanner;

        digitalizadora.digitalizar();


    }
}
