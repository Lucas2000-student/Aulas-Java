package Aula07;
import Aula05.Produto;
import java.util.Scanner;

public class Ex20DW {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Produto[] ListaProduto = new Produto[10];
        int i = 0;

        do{
            Produto p = new Produto();

            System.out.print("Digite o ID do produto: ");
            p.id = sc.nextInt();
            System.out.print("Digite a descrição do produto: ");
            p.descricao = sc.next();
            System.out.print("Digite o valor da produto: ");
            p.valor = sc.nextDouble();
            System.out.print("Digite a quantidade do produto: ");
            p.quantidade = sc.nextInt();

            ListaProduto[i] = p;
            i++;
        }
        while(i < 10);
        i = 0;
        System.out.println("Os produtos com valores menores de 100 em com mais de 10 em estoque são: ");
        do{
            if ((ListaProduto[i].valor < 100) && (ListaProduto[i].quantidade > 10))
                System.out.println("ID= " + ListaProduto[i].id + ", Descrição: " + ListaProduto[i].descricao + ", Valor: " + ListaProduto[i].valor + ", Quantidade: " + ListaProduto[i].quantidade);
            i++;
        }
        while(i < 10);

        sc.close();
    }
}