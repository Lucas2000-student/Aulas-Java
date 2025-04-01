package Aula07;

import java.util.Scanner;

public class Ex17DW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, num, maior=0, p=0, n=0, menor=0, m2 = 0, p1, p2;
        double soma=0, media;

        do{
            System.out.print("Digite um numero: ");
            num = sc.nextInt();
            if (i == 1){
                maior = num;
                menor = num;
            }
            if (num >= 0)
                p = p + 1;
            else
                n = n + 1;

            if (num > maior)
                maior = num;

            if (num < menor)
                menor = num;

            soma = soma + num;
            i++;
        }
        while (i <= 5);

        media = soma / 5;

        p1 = (p *100)/5;
        p2 = (n *100)/5;
        System.out.println("O maior número encontrado é: " + maior);
        System.out.println("O menor número encontrado é: " + menor);
        System.out.println("A soma de todos eles é: " + soma);
        System.out.println("A média é" + media);
        System.out.println("A % de números positivos é: " + p1);
        System.out.println("A % de números negativos é: " + p2);

        sc.close();
    }
}