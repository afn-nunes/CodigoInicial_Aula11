package classes;

import interfaces.Acelerador;

public class Motorista extends Pessoa implements Acelerador{
    private int matricula;
    private String habilitacao;
    private Carro veiculo;

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getHabilitacao() {
        return habilitacao;
    }
    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public Carro getVeiculoAtual() {
        return veiculo;
    }
    public void setVeiculoAtual(Carro veiculoAtual) {
        this.veiculo = veiculoAtual;
    }

    public Motorista(String nome, String cpf) {
        super(nome, cpf);
    }

    public Motorista(String nome, String cpf, int matricula, String habilitacao) {
        super(nome, cpf);
        this.matricula = matricula;
        this.habilitacao = habilitacao;
    }

    @Override
    public String cumprimentar(Pessoa outraPessoa){
        String cumprimentoInicial = super.cumprimentar(outraPessoa);
        return String.format("%s Meu nome é %s e serei seu motorista de hoje!", cumprimentoInicial, getNome());
    }

    @Override
    public void acelerar(int limite){
        veiculo.acelerar(limite);
    }
    @Override
    public void acelerar() {
        veiculo.acelerar();     
    }

    @Override
    public int getVelocidadeAtual() {
        return veiculo.getVelocidadeAtual();
    }


}
