import ex_construcao_relatorio.Relatorio;
import ex_construcao_relatorio.RelatorioBuilder;
import ex_construcao_veiculo.Veiculo;
import ex_construcao_veiculo.VeiculoBuilder;
import ex_pizza.Pizza;
import ex_pizza.PizzaBuilder;

public class Main {
    public static void main(String[] args) {
        pizza();
        veiculo();
        relatorio();
    }

    private static void pizza() {
        Pizza pizza = new PizzaBuilder()
                .setMassa("Farinha branca")
                .setTamanho("60cm")
                .addIngredientes("4 queijos, Bacon, Presunto, Salame, Toicinho e Cheddar")
                .build();
        System.out.println(pizza);
    }

    private static void veiculo() {
        Veiculo veiculo = new VeiculoBuilder()
                .setTipo("Carro")
                .setCor("Branco")
                .setRodas("4")
                .build();
        System.out.println(veiculo);
    }

    private static void relatorio() {
        Relatorio relatorio = new RelatorioBuilder()
                .setTitulo("Como Fazer Café com Leite?")
                .setCorpo("Pegue uma xícara de chá de leite e encha 3/4, após isso preencha o " +
                        "1/4 restante com café solúvel ou coado e mecha com uma colher!")
                .setRodape("Receita com medidas que servem até uma pessoa.")
                .build();
        System.out.println(relatorio);
    }
}