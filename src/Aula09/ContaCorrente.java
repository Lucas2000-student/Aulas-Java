package Aula09;

public class ContaCorrente extends Conta{
     private double limite;

     public ContaCorrente() {}

     public ContaCorrente(int numero, int agencia, String titular, double saldo, double limite) {
          super(numero, agencia, titular, saldo);
          this.limite = limite;
     }
}
