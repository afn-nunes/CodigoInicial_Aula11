package programa;

import classes.Carro;
import classes.Liquidificador;
import classes.Motorista;
import exceptions.PlacaInvalidaException;
import interfaces.Acelerador;

public class App {

    public static void main(String[] args) throws PlacaInvalidaException{
        Acelerador[] aceleradores = new Acelerador[4];
        Motorista mot = new Motorista("André", "10335723730");

        aceleradores[0] = new Carro("ABC1234", 123, new Motorista("João", "12345678900"));
        aceleradores[1] = new Carro("KVJ0399", 456,  mot);
        aceleradores[2] = mot;
        aceleradores[3] = new Liquidificador();
        
        for (Acelerador acelerador : aceleradores) {
            acelerador.acelerar();
            System.out.printf("Chamada do método em objeto do tipo %s - ", acelerador.getClass().getSimpleName());
            System.out.printf("Velocidade atual: %s\n", acelerador.getVelocidadeAtual());
        }
    }
}