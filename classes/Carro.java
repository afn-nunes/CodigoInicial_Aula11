package classes;

import exceptions.PlacaInvalidaException;
import interfaces.Acelerador;

public class Carro implements Acelerador{
    private String placa;
    private int numChassi;
    private int velocidadeAtual;
    private Motorista motorista;

    @Override
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) throws PlacaInvalidaException{
        if(placa == null){
            throw new PlacaInvalidaException("O valor da placa não pode ser nulo");
        }
        if (placa.length() != 7){
            throw new PlacaInvalidaException("A placa deve ter 7 caracteres");
        } 
        if (!placa.matches("[A-Z]{3}\\d{4}")){
            throw new PlacaInvalidaException();
        }
        this.placa = placa;
    }

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }

    @Override
    public void acelerar() {
        velocidadeAtual++;
    }

    @Override
    public void acelerar(int limite) {
        for (int i = 0; i < limite; i++) {
            this.acelerar();
        }
    }

    public Carro(String placa, int numChassi, Motorista motorista) throws PlacaInvalidaException{
       setPlaca(placa);
        this.numChassi = numChassi;
        this.motorista = motorista;
        motorista.setVeiculoAtual(this);
    }
    
}
