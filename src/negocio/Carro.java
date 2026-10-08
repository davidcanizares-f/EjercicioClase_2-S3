package negocio;

public class Carro {
    private int potencia;
    private double velocidad;

    //constructor por defecto: Java completa el codigo
    public Carro(){

    }

    public Carro(int potencia, double velocidad){

        this.potencia = potencia;
        this.velocidad = velocidad;

        //si atributos tienen restricciones se debe invocar a los setters.


    }

    public void setPotencia(int potencia){
        if(potencia < 0){
            potencia=0;
        }
        this.potencia=potencia;
    }
    public int getPotencia(){
        return potencia;
    }

    public void setVelocidad(double velocidad){
        if(velocidad < 0){
            velocidad=0;
        }
        this.velocidad=velocidad;
    }
    public double getVelocidad(){
        return velocidad;
    }


    public void acelerar(){
        velocidad += potencia;
    }

    void frenar() {
        velocidad /= 2;
    }

}