package ex_construcao_veiculo;

public class VeiculoBuilder {
    Veiculo veiculo = new Veiculo();

    public VeiculoBuilder setTipo(String tipo) {
        this.veiculo.setTipo(tipo);
        return this;
    }

    public VeiculoBuilder setCor(String cor) {
        this.veiculo.setCor(cor);
        return this;
    }

    public VeiculoBuilder setRodas(String qtdRodas) {
        this.veiculo.setQtdRodas(qtdRodas);
        return this;
    }

    public Veiculo build() { return this.veiculo; }
}
