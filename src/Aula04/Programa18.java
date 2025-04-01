package Aula04;

import java.util.Scanner;

public class Programa18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i=1, num, m1=0, m2=0 , soma=0, media, po=0, ne=0, p1=0, p2=0;

        System.out.print("Insira o valor de N, sendo positivo e menor de 20: ");
        n = sc.nextInt();
        while((n > 20) || (n <=0)){
            System.out.println("ERRO! Mal conduta detectada!");
            System.out.print("Positivo e abaixo de 20: ");
            n = sc.nextInt();
        }
        while(i <=n){
            System.out.print("Digite um numero: ");
            num = sc.nextInt();

            if (num >= 0)
                po = po + 1;
            else
                ne= ne + 1;
            if (num > m1)
                m1 = num;
            if (i == 1){
                m1 = num;
                m2 = num;
            }
            if (num < m2)
                m2 = num;
            soma = soma + num;
            i = i + 1;
        }
        media = soma/n;
        p1 = (po *100)/n;
        p2 = (ne *100)/n;

        System.out.println("O maior valor é: " + m1);
        System.out.println("O menor valor é: " + m2);
        System.out.println("A soma de todos é: "+ soma);
        System.out.println("A média é: "+ media);
        System.out.println("A % de números positivos é: "+ p1);
        System.out.println("A % de números negativos é: "+ p2);
        sc.close();
    }
}