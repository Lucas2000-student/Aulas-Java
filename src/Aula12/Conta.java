package Aula12;

import java.util.ArrayList;

public abstract class Conta {
    private int agencia;
    private int numero;
    protected ArrayList<String> extrato = new ArrayList<String>();
    protected Double saldo;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public ArrayList<String> getExtrato() {
        return extrato;
    }

    public Conta() {
        this.saldo = 0.0;
    }

    public Conta(int agencia, int numero, Double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public abstract void deposito(double valor);
    public abstract void sacar(double valor);
}
