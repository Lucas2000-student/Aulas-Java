package Aula02;

import java.util.Scanner;

public class Programa04 {
    public static void main(String[]arg)
    {
        double a, b, c, d, valor, media;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        a = sc.nextDouble();
        System.out.print("Insira o segundo valor: ");
        b = sc.nextDouble();
        System.out.print("Insira o terceiro valor: ");
        c = sc.nextDouble();
        System.out.print("Insira o quarto valor: ");
        d = sc.nextDouble();
        valor = a + b + c + d;
        media = valor/4;
        System.out.printf("O valor total entre eles é %.1f, então %.1f é a média", valor, media);

        sc.close();
    }
}
