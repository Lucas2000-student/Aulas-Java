package Aula16;

import java.util.HashMap;
import java.util.Scanner;

public class Vestibular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Aluno> alunos = new HashMap<Integer, Aluno>();
        String alunoVestibular = "Jose dos Santos,7,São Paulo;Sandra Silva,6.5,São Jose do Rio Preto;Augusto Soares,8,São Paulo;Vanderlei Azevedo,5.65,Santos;Vanessa Ferreira,9,São Paulo;Natan Cruz,10,São Paulo.";
        String[] alunoInfo = alunoVestibular.split(";");
        String[] info;
        double nota = 0;
        int id = 1;

        for (String i : alunoInfo) {
            Aluno aluno = new Aluno();
            info = i.split(",");
            aluno.setNome(info[0]);
            nota = Double.parseDouble(info[1]);
            aluno.setNota(nota);
            aluno.setCidade(info[2]);
            if (nota >= 7){
                alunos.put(id, aluno);
                id++;
            }
        }
        alunos.forEach((key, value) ->{
            System.out.println("Nome: " + value.getNome() + "\nNota: " + value.getNota() + "\nCidade: " + value.getCidade() + "\n");
        });
        sc.close();
    }
}
