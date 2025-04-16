package Aula16;

public class Produto {
    private String nome;
    private int quant;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto() {
    }

    public Produto(String nome, int quant, double preco) {
        this.nome = nome;
        this.quant = quant;
        this.preco = preco;
    }
}
