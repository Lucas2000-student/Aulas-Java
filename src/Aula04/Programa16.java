package Aula04;

import java.util.Scanner;

public class Programa16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b=1, c=1, r;

        System.out.print("Digite um valor positivo: ");
        a = sc.nextInt();

        while(a <= 0){
            System.out.println("Isso não é positivo!");
            System.out.print("Tente novamente: ");
            a = sc.nextInt();
            c = c+1;
        }
        if (c >= 2){
            System.out.printf("Depois de %d  tentativas aprendeu o que é valor positivo?\n", c);
        }
        System.out.printf("Agora com %d sendo um valor positivo, sua tabuada é:\n",a);
        while(b <= 10){
            r = a * b;
            System.out.println(a + "x" + b + "=" + r);
            b = b + 1;
        }

        sc.close();
    }
}
