package classes;

import exceptions.PlacaInvalidaException;

public class Carro implements Acelerador{
    private String placa;
    private String letrasPlaca;
    private int numerosPlaca;
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
        if(placa != null && placa.length() == 7 && placa.matches("[A-Z]{3}\\d{4}")){
            this.letrasPlaca = placa.substring(0,3);
            this.numerosPlaca = Integer.parseInt(placa.substring(0,3));
            this.placa = placa;
        }else{
            throw new PlacaInvalidaException();
        }
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
