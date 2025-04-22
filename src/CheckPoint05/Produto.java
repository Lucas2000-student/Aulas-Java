package CheckPoint05;

public class Produto {
    private String nome;
    private double preco;
    private int quant;
    private double total;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
    public double getTotal(){
        return total;
    }

    public Produto() {
    }

    public void calculoTotal(double preco, int quant){
        this.total = preco * quant;
    }
}
