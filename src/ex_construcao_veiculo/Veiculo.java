package ex_construcao_veiculo;

public class Veiculo {
    private String tipo = "";
    private String cor = "";
    private String qtdRodas = "";

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setQtdRodas(String qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    @Override
    public String toString() {
        return "\n=== VEICULO ===" +
                "\nTipo: " + tipo +
                "\nCor: " + cor +
                "\nQuantidade de rodas: " + qtdRodas;
    }
}
