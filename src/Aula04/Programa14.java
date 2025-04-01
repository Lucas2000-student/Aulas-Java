package Aula04;

import java.util.Scanner;

public class Programa14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b=1;

        System.out.print("Digite um número posítivo: ");
        a = sc.nextInt();

        while(a <= 0){
            System.out.print("Eu disse positivo! DE NOVO: ");
            a = sc.nextInt();
            b=b+1;
        }
        System.out.printf("Parabéns! Demorou %d tentativas pra conseguir", b);

        sc.close();
    }
}
