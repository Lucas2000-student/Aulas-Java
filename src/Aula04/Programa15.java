package Aula04;

import java.util.Scanner;

public class Programa15 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Insira dois valores distindos com o 1° sendo menor que o 2°");
        System.out.print("Insira o 1° Valor: ");
        a = sc.nextInt();
        System.out.print("Insira o 2° Valor: ");
        b = sc.nextInt();

        while(a >= b){
            System.out.print("Eu disse que o segundo tem que ser maior: ");
            b = sc.nextInt();
        }
        System.out.printf("O valor %d é menor que %d", a, b);
        sc.close();
    }
}
