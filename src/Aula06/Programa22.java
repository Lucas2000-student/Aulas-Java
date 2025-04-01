package Aula06;

import java.util.Scanner;

public class Programa22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBanco[] ListaBanco = new ContaBanco[30];
        int i = 0, choice = 0, c = 0, d1 = 0, d2 = 0;

        while(i < 1){
            ContaBanco b = new ContaBanco();
            System.out.println("Bem vindo ao Banco!");
            System.out.println("Por favor selecione uma das opções: ");
            System.out.println("1- Criar uma conta.\n2- Efetuar um depósito.\n3- Efetuar saque.\n4- Saldo atual.");
            choice = sc.nextInt();

            if (choice == 1){
                System.out.println("Criação de conta, insira as informações: ");
                System.out.print("Seu nome: ");
                b.nome = sc.next();
                System.out.print("Nº Agência: ");
                b.agencia = sc.next();
                System.out.print("Nº Conta: ");
                b.conta = sc.next();
                b.saldo = 0;
                System.out.println("Cadastro Concluído! Seu cadastro é: " + c);
                System.out.println(b.ContaCliente());
                ListaBanco[c] = b;
                c = c+1;
            }
            else if(choice == 2){
                System.out.print("Por favor insira seu cadastro: ");
                d1 = sc.nextInt();
                System.out.print("Quanto deseja depositar? ");
                d2 = sc.nextInt();
                ListaBanco[d1].depositar(d2);
                System.out.println("Depósito de R$" + d2 + " Realizado!");
            }
            else if(choice == 3){
                System.out.print("Por favor insira seu cadastro: ");
                d1 = sc.nextInt();
                System.out.print("Quanto deseja sacar? ");
                d2 = sc.nextInt();
                ListaBanco[d1].sacar(d2);
            }
            else if(choice == 4){
                System.out.print("Por favor insira seu cadastro: ");
                d1 = sc.nextInt();
                System.out.println("Seu saldo atual é: R$" + ListaBanco[d1].saldo);
            }
            else
                System.out.println("Valor desconhecido!");
        }
        sc.close();
    }
}