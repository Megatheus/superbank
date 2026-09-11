package Aula4;

public abstract class Conta {
    private double numconta;
    protected double numbanco;
    protected double saldo;


    Conta(double numbanco, double saldo){
        this.numbanco = numbanco;
        this.saldo = saldo;
    }

    public double getNumconta(){
        return numconta;
    }

    public void setNumconta(double numconta){
        this.numconta = numconta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
}
