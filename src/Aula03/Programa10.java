package Aula03;

import java.util.Scanner;

public class Programa10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Insira o primeiro valor:");
        a = sc.nextInt();
        System.out.print("Insira o segundo valor: ");
        b = sc.nextInt();

        if (a > b){
            System.out.printf("%d é o maior valor", a);
        }
        else if (b > a){
            System.out.printf("%d é o mair valor", b);
        }
        else{
            System.out.print("Os valores são iguais");
        }
        sc.close();
    }
}
