package exceptions;

public class PlacaInvalidaException extends Exception{
    public PlacaInvalidaException(){
        super("A placa deve ser composta por 3 letras e 4 números");
    }

    public PlacaInvalidaException(String mensagem){
        super(mensagem);
    }
}
