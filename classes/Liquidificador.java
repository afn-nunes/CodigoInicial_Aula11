package classes;

import interfaces.Acelerador;

public class Liquidificador implements Acelerador{
    private int rotacao;
    public int getRotacao() {
        return rotacao;
    }

    public void setRotacao(int rotacao) {
        this.rotacao = rotacao;
    }

    @Override
    public void acelerar() {
       this.rotacao++;        
    }

    @Override
    public void acelerar(int limite) {
       for (int i = 0; i < limite; i++) {
          acelerar();
       }
        
    }

    @Override
    public int getVelocidadeAtual() {
        return getRotacao();
    }
    
}
