package Aula09;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa24 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        ArrayList<ContaCorrente> cc = new ArrayList<>();
        ArrayList<ContaPoupanca> cp = new ArrayList<>();
        ArrayList<ContaSalario> cs = new ArrayList<>();

        int opcao = 0, po = 2, sa = 2, co = 2, n1 = 0;

        do{
            System.out.println("====== Bem vindo ao Banco! ======\n");
            System.out.println("1 - Conta Corrente.\n" +
                    "2 - Conta Poupanca.\n" +
                    "3 - Conta Salario.\n" +
                    "4 - Exibir Contas.\n" +
                    "5 - Sair.\n");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            if(opcao == 1){
                ContaCorrente cc1 = new ContaCorrente();
                cc1.setAgencia(555);
                n1 = 50000000 + co;
                co = co + 3;
                cc1.setNumero(n1);
                cc1.setSaldo(0.00);
                System.out.print("Digite seu primeiro nome: ");
                cc1.setTitular(sc.next());
                cc.add(cc1);
                System.out.println("Conta corrente com sucesso!");
                System.in.read();
            }
            else if(opcao == 2){
                ContaPoupanca cp1 = new ContaPoupanca();
                cp1.setAgencia(556);
                n1 = 51000000 + po;
                po = po + 3;
                cp1.setNumero(n1);
                cp1.setSaldo(0.00);
                System.out.print("Digite seu primeiro nome: ");
                cp1.setTitular(sc.next());
                cp.add(cp1);
                System.out.println("Conta Poupança com sucesso!");
                System.in.read();
            }
            else if(opcao == 3){
                ContaSalario cs1 = new ContaSalario();
                cs1.setAgencia(557);
                n1 = 52000000 + sa;
                sa = sa + 3;
                cs1.setNumero(n1);
                cs1.setSaldo(0.00);
                System.out.print("Digite seu primeiro nome: ");
                cs1.setTitular(sc.next());
                cs.add(cs1);
                System.out.println("Conta Salario com sucesso!");
                System.in.read();
            }
            else if(opcao == 4){
                System.out.println("Titulares cadastrados: \n");
                System.out.print("=== Conta corrente ===\n ");
                for(ContaCorrente c: cc){
                    System.out.println("Agencia: "+ c.getAgencia() + " Numero: " + c.getNumero() + " Titular: " + c.getTitular());
                }
                System.out.print("=== Conta Poupança ===\n ");
                for(ContaPoupanca c: cp){
                    System.out.println("Agencia: "+ c.getAgencia() + " Numero: " + c.getNumero() + " Titular: " + c.getTitular());
                }
                System.out.print("=== Conta Salário ===\n ");
                for(ContaSalario c: cs){
                    System.out.println("Agencia: "+ c.getAgencia() + " Numero: " + c.getNumero() + " Titular: " + c.getTitular());
                }
                System.in.read();
            }
        }while(opcao != 5);
        sc.close();
    }
}
