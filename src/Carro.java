package src;

public class Carro extends Auto implements IAuto {

    private String marca;
    private String modelo;
    private Boolean acao;

    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Boolean getAcao() {
        return acao;
    }

    public void setAcao(Boolean acao){
        this.acao = acao;
    }

    public double acelerar(double acelerar) {
        this.setAcelerar(getAcelerar() + acelerar);
        return this.getAcelerar();
    }

    public double parar(double parar) {
        this.setParar(getParar() - parar);
        return this.getParar();
    }

    public void marcha(int marcha) {
        if (marcha <0 || marcha > 5) {
            System.out.println("Marcha inválida!");
            return;
        }
        this.setMarcha(marcha);
    }

}
