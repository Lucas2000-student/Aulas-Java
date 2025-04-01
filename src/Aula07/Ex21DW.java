package Aula07;

import Aula05.Aluno;

import java.util.Scanner;

public class Ex21DW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno[] ListaAluno =  new Aluno[5];

        int i = 0, j = 0;

        do{
            Aluno a = new Aluno();

            System.out.print("Digite o nome do aluno: ");
            a.nome = sc.next();
            System.out.print("Digite o RA: ");
            a.RA = sc.next();
            System.out.print("Digite o período: ");
            a.periodo = sc.next();
            a.materias = new String[6];

            do{
                System.out.print("Digite a " + j + 1 + "° materia");
                a.materias[j] = sc.next();
                j++;
            }
            while (j < 6);

            ListaAluno[i] = a;
            i++;
        }
        while(i < 5);
        /*
        while(i < 5){
            Aluno a = new Aluno();

            System.out.print("Digite o nome do aluno: ");
            a.nome = sc.next();
            System.out.print("Digite o RA: ");
            a.RA = sc.next();
            System.out.print("Digite o período: ");
            a.periodo = sc.next();
            a.materias = new String[6];

            j = 0;
            while (j > 6) {
                System.out.print("Digite a " + j+1 + "° materia");
                a.materias[j] = sc.next();
                j = j + 1;
            }

            ListaAluno[i] = a;

            i = i + 1;
        }
        i = 0;
        System.out.println("Lista dos alunos do período noturno: ");

        while(i < 5){

            if (ListaAluno[i].periodo.equals("noturno")){
                System.out.println("RA" + ListaAluno[i].RA + ", Nome: " + ListaAluno[i].nome);
                System.out.println("Nas Matérias: ");
                j = 0;
                while(j < 6){
                    System.out.println(ListaAluno[i].materias[j]);
                    j = j + 1;
                }
            }
            i = i + 1;
        }
        */
        sc.close();
    }
}
