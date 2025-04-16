package Aula16;

import java.util.ArrayList;
import java.util.Scanner;

public class AlunoProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> Alunos = new ArrayList<>();
        ArrayList<Produto> Produtos = new ArrayList<>();
        String Lista = "CJose dos Santos,42,Sao Paulo;CSandra Silva,36,Sao Jose do Rio Preto;CAugusto Soares,22,Sao Paulo;CVanderlei Azevedo,45,Santos;CVanessa Ferreira,27,Sao Paulo;PMouse,1,9.90;PTeclado,3,19.90;PMonitor,2,349.90;PHD SSD,2,199.90;PProcessador,1,350.00";
        String[] APlista = Lista.split(";");
        String[] infos;
        int idade = 0, quant = 0;
        double preco = 0;

        for(String i : APlista){
            infos = i.split(",");
            for (String j: infos){
                if(j.startsWith("C")){
                    Aluno a = new Aluno();
                    a.setNome(infos[0]);
                    idade = Integer.parseInt(infos[1]);
                    a.setIdade(idade);
                    a.setCidade(infos[2]);
                    Alunos.add(a);
                }
                else if(j.startsWith("P")){
                    Produto p = new Produto();
                    p.setNome(infos[0]);
                    quant = Integer.parseInt(infos[1]);
                    p.setQuant(quant);
                    preco = Double.parseDouble(infos[2]);
                    p.setPreco(preco);
                    Produtos.add(p);
                }
            }
        }

        for(Aluno a: Alunos){
            System.out.println("Nome: " + a.getNome().substring(1) + "\nIdade: " + a.getIdade() + "\nCidade: " + a.getCidade() + "\n");
        }
        for (Produto p: Produtos){
            System.out.println("Nome: " + p.getNome().substring(1) + "\nQuant: " + p.getQuant() + "\nPreço: R$" + p.getPreco() + "\n");
        }
        sc.close();
    }
}