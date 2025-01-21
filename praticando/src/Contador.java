public class Contador {
    public static void main(String[] args) {
        
        int numeroUm = 5;
        int numeroDois = 10;

        try {
            
            contar(numeroUm, numeroDois);

        } catch (ParametroUm exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int numeroUm, int numeroDois) throws ParametroUm{
        
        if (numeroUm > numeroDois) {
            System.out.println("O número dois deve ser maior que o número um");
        }

        int contagem = numeroDois - numeroUm;

        for(int i=1; i< contagem; i++){
            System.out.println("O número da contagem é " + i);
        }
    }
}
