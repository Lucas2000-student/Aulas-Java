package Aula07;

import java.util.Scanner;

public class Ex16DW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b=1, c=1, r;

        do {
            System.out.print("Digite um valor positivo: ");
            a = sc.nextInt();
            if (a <= 0){
                c++;
            }
        }
        while (a <= 0);
        if (c >= 2){
            System.out.printf("Depois de %d  tentativas aprendeu o que é valor positivo?\n", c);
        }
        System.out.printf("Agora com %d sendo um valor positivo, sua tabuada é:\n",a);
        do {
            r = a * b;
            System.out.println(a + "x" + b + "=" + r);
            b++;
        }
        while(b <= 10);

        sc.close();
    }
}
