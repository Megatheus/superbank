package Aula3;

public class Poupanca extends Conta implements IContas, ICliente {
    

    @Override
    public double saldo() {
        return this.getSaldo();
    }

    @Override
    public double depositar(double valor) {
        return valor;
    }

    @Override
    public double sacar(double valor) {
        return valor;
    }

    @Override
    public void abrirConta() {
        
        Corrente c1 = new Corrente();
        c1.setNumbank(001);
        c1.setNumero(10.115);

         //Dados do cliente


        System.out.println("Seu banco é :" + this.getNumbank() +
                       "\n Sua conta corrente é: " + this.getNumero() +
                       "\n Nome do cliente: " + this.getCpfclien() +
                       "\n CPF do cliente: " + this.getCpfclien());


    }

    private String getCpfclien() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCpfclien'");
    }
    
}
