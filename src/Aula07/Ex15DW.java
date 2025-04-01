package Aula07;

import java.util.Scanner;

public class Ex15DW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Insira dois valores distindos com o 1° sendo menor que o 2°");
        System.out.print("Insira o 1° Valor: ");
        a = sc.nextInt();
        do {
            System.out.print("Insira o 2° Valor: ");
            b = sc.nextInt();
        }
        while (b <= a);

        System.out.printf("O valor %d é menor que %d", a, b);
        sc.close();
    }
}
