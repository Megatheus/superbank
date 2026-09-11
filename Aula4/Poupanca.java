package Aula4;

public class Poupanca extends Conta {

    Poupanca(double numbanco, double saldo){
        super(numbanco, saldo);
        this.numbanco = numbanco;
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.getSaldo();
    }

    public double getDeposito(double valor){
        return this.getSaldo() + valor;
    }
    
}
