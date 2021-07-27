package programa;

import classes.Autenticador;
import classes.Carro;
import classes.Motorista;
import exceptions.PlacaInvalidaException;

public class Programa {
    public static void main(String[] args) {
        Autenticador autenticador = new Autenticador();
        Motorista motorista = new Motorista("André", "10335723730", 12345, "B");
        
        if (autenticador.credenciado(motorista)){
            System.out.println("Acesso autorizado: \n" + motorista);
        }else{
            System.out.println("Acesso não autorizado");
        }


        try {
            Carro carro = new Carro("ABC1234", 123, motorista);

            if (autenticador.credenciado(carro)){
                System.out.println("Acesso autorizado: \n" + carro.getMotorista());
            }else{
                System.out.println("Acesso não autorizado");
            }
        } catch (PlacaInvalidaException e) {
            System.out.println(e.getMessage());
        }



    }
}
