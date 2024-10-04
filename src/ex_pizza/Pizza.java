package ex_pizza;

public class Pizza {
    private String massa = "";
    private String tamanho = "";
    private String ingredientes = "";

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void addIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return  "\n=== PIZZA ===" +
                "\nMassa: " + massa +
                "\nTamanho: " + tamanho +
                "\nIngredientes: " + ingredientes;
    }

}