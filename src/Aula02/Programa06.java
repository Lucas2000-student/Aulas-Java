package Aula02;

import java.util.Scanner;

public class Programa06 {
    public static void main(String[]args)
    {
        double c, d, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a Cotação do dollar: ");
        c = sc.nextDouble();
        System.out.print("Insira o valor em Dollar: ");
        d = sc.nextDouble();
        r = c * d;
        System.out.printf("O valor em real será: %.2f", r);
        sc.close();
    }
}
