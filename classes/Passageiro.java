package classes;

public class Passageiro extends Pessoa{
    private int codigoCliente;

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Passageiro(String nome, String cpf, int codigoCliente) {
        super(nome, cpf);
        this.codigoCliente = codigoCliente;
    }    
}