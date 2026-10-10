package AulaCarro;

public abstract class Auto {

    private double acelerar;
    private double parar;
    private int marcha;

    public double getAcelerar(){
        return acelerar;
    }

    public void setAcelerar(double acelerar){
        this.acelerar = acelerar;
    }

    public double getParar(){
        return parar;
    }

    public void setParar(double parar){
        this.parar = parar;
    }

    public int getMarcha(){
        return marcha;
    }

    public void setMarcha(int marcha){
        this.marcha = marcha;
    }

}
