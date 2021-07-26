package programa;

import classes.Acelerador;
import classes.Carro;
import classes.Motorista;
import exceptions.PlacaInvalidaException;
/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Acelerador[] aceleradores = new Acelerador[3];
        Motorista mot = new Motorista("André", "103357");

        try {
            aceleradores[0] = new Carro("ABC1234", 3232423, mot);
            aceleradores[1] = new Carro("ABC1234", 3232423, new Motorista("Maria", "00962"));
            aceleradores[2] = mot;
        } catch (PlacaInvalidaException e) {
            e.printStackTrace();
        }
        for (Acelerador acelerador : aceleradores) {
            acelerador.acelerar();
            System.out.printf("Chamada do método em objeto do tipo %s:", acelerador.getClass().getSimpleName());
            System.out.printf("  -  Velocidade atual: %d\n", acelerador.getVelocidadeAtual());
        }
    }
}