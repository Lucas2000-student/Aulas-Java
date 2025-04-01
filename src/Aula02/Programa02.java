package Aula02;

import java.util.Scanner;

public class Programa02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, soma;
        System.out.print("Digite o primeiro valor: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        b = sc.nextInt();
        soma = a + b;
        System.out.print(soma);
        sc.close();
    }
}
