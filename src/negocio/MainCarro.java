package negocio;

public class MainCarro {
    static void main() {
        //Carro c1 = new Carro();
        Carro c2 = new Carro(-2, -80);
        //Carro c3 = new Carro();
        System.out.println("La potencia del carro 2 es: " + c2.getPotencia() +
                " y la velocidad es: " + c2.getVelocidad());
        /*c1.potencia = 2;
        c1.velocidad = 80;


        c3.potencia = 2;
        c3.velocidad = 80;*/


        /*c1.acelerar();
        c1.acelerar();
        c1.frenar();

        c2.acelerar();
        c2.acelerar();
        c2.acelerar();

        c3.frenar();
        c3.frenar();

        System.out.println("La potencia del carro 1 es: " + c1.potencia +
                " y la velocidad es: " + c1.velocidad);
        System.out.println("La potencia del carro 2 es: " + c2.potencia +
                " y la velocidad es: " + c2.velocidad);
        System.out.println("La potencia del carro 3 es: " + c3.potencia +
                " y la velocidad es: " + c3.velocidad);*/
    }
}