package Aula03;

import java.util.Scanner;

public class Programa08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;

        System.out.print("Digite o primeiro valor: ");
        a = sc.nextDouble();
        System.out.print("Digite o segundo valor: ");
        b = sc.nextDouble();

        if(a > b){
            System.out.printf("%.2f É o maior valor", a);
        }
        else {
            System.out.printf("%.2f É o maior valor", b);
        }
        sc.close();
        }
    }
