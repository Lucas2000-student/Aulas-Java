package Aula02;

import java.util.Scanner;

public class Programa05 {
    public static void main(String[]arg)
    {
        int tc, tf;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor em Celcius: ");
        tc = sc.nextInt();
        tf = tc * (9/5) + 32;
        System.out.printf("%d Celcius é perspectivamente %d em Farenheint", tc, tf);

        sc.close();
    }

}
