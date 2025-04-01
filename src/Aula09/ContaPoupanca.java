package Aula09;

public class ContaPoupanca extends Conta{
    private double rendimento;

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public ContaPoupanca() {

    }

    public ContaPoupanca(int numero, int agencia, String titular, double saldo, double rendimento) {
        super(numero, agencia, titular, saldo);
        this.rendimento = rendimento;
    }
}
