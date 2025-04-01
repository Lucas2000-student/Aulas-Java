package Aula02;

import java.util.Scanner;

public class Programa03 {
    public static void main(String[] args) {

        int base, altura, area;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a Base");
        base = sc.nextInt();
        System.out.print("Insira a altura");
        altura = sc.nextInt();
        area = base * altura /2;
        System.out.printf("Um Triângulo de Base %d e Altura %d tem %d de área", base, altura, area);
        sc.close();
    }
}
