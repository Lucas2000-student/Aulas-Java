package Aula06;

public class ContaBanco {
    public String nome;
    public String agencia;
    public String conta;
    public double saldo;

    public ContaBanco(){}

    public ContaBanco(String nome, String agencia, String numeroconta){
        this.nome = nome;
        this.agencia = agencia;
        this.conta = numeroconta;
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public void sacar(double valor){
        if (this.saldo >= valor)
            this.saldo = this.saldo - valor;
        else
            System.out.println("Saldo insuficiente");
    }

    public String ContaCliente(){
        String info = "Nome: " + this.nome + " - Conta: " + this.agencia + "-" + this.conta + " - Saldo: R$" + this.saldo;
        return info;
    }
}
