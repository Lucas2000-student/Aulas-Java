package Aula07;

import java.util.Scanner;

public class Ex14DW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b=1;

        do {
            System.out.print("Digite um número posítivo: ");
            a = sc.nextInt();
            if(a <= 0){
                b++;
            }
        }
        while (a <= 0);

        System.out.printf("Parabéns! Demorou %d tentativas pra conseguir", b);

        sc.close();
    }
}
