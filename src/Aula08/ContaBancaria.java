package Aula08;

public class ContaBancaria {
    private int agencia;
    private int numero;
    private double saldo;

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
    public double getSaldo() {

        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    ContaBancaria(){}

    ContaBancaria(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
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
    public void transferir(double valor, Cliente clientedestino){
        sacar(valor);
        clientedestino.getConta().depositar(valor);
    }
    public void consultarSaldo(){
        System.out.print("Seu saldo atual é R$" + saldo);
    }

}
