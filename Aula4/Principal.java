package Aula4;

public class Principal {

    public static void main (String[] args){

        IConta corrente = new Corrente(1, 500.0);
        Poupanca poupanca = new Poupanca(2, 250.0);

        corrente.deposito(100.1);
        poupanca.getDeposito(50);
    }
    
}
