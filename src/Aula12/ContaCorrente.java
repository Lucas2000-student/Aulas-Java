package Aula12;

public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public ContaCorrente() {
    }

    public ContaCorrente(int agencia, int numero, Double saldo, double chequeEspecial) {
        super(agencia, numero, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public void deposito(double valor) {
        valor = valor - 0.10;
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
