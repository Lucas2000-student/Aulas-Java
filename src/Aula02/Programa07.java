package Aula02;

import java.util.Scanner;

public class Programa07 {
    public static void main(String[]args){
        double p1, p2, p3, p4, p5, soma, total, troco;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor do tablet: ");
        p1 = sc.nextDouble();
        System.out.print("Insira o valor do Note: ");
        p2 = sc.nextDouble();
        System.out.print("Insira o valor do Celular: ");
        p3 = sc.nextDouble();
        System.out.print("Insira o valor do SmartWhat: ");
        p4 = sc.nextDouble();
        System.out.print("Insira o valor do fone: ");
        p5 = sc.nextDouble();

        soma = p1 + p2 + p3 + p4 + p5;

        System.out.printf("O total será %.2f", soma);
        System.out.print("Quanto será o pagamento? ");
        total = sc.nextDouble();

        troco = total - soma;

        System.out.printf("Seu troco será %.2f", troco);

        sc.close();
    }
}
