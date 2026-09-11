package Aula4;

public class Corrente extends Conta implements IConta {

    Corrente (double numbanco, double saldo){
        super(numbanco, saldo);
    }

    @Override
    public double saldo() {
        return  this.getSaldo();
    }

    @Override
    public double deposito(double valor) {
        this.saldo += valor;
        return this.saldo();
    }

    @Override
    public double saque(double valor) {
        this.saldo -= valor;
        return this.saldo();

    }
}
