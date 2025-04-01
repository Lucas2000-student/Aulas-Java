package Aula03;

import java.util.Scanner;

public class Programa09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Digite o primeiro valor: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        b = sc.nextInt();

        if(a < b){
            System.out.printf("%d É o Menor valor", a);
        }
        else {
            System.out.printf("%d É o Menor valor", b);
        }
        sc.close();
    }
}
