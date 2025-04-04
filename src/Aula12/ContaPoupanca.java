package Aula12;

public class ContaPoupanca extends Conta {
    private double Rendimento;

    public double getRendimento() {
        return Rendimento;
    }

    public void setRendimento(double rendimento) {
        Rendimento = rendimento;
    }

    public ContaPoupanca() {
    }

    public ContaPoupanca(int agencia, int numero, Double saldo, double rendimento) {
        super(agencia, numero, saldo);
        Rendimento = rendimento;
    }

    public void deposito(double valor) {
        valor = valor + Rendimento;
        this.saldo += valor;
        extrato.add("Realizado um depósito de: R$" + valor + "Totalizando um saldo de R$" + this.saldo + "\n");
    }

    public void sacar(double valor) {
        if(valor > this.saldo) {
            System.out.println("Saldo Insuficiente.");
            extrato.add("Tentativa de realizar um saque de: R$ " + valor + "Sendo exedente do valor em Conta. \n");
        }
        else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            extrato.add("Realizado um saque de: R$" + valor + "Totalizando um saldo de R$" + this.saldo + "\n");
        }
    }
}
