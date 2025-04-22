package CheckPoint05;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        int i = 1;

        System.out.println("Bem vindo ao organizador de itens!");
        System.out.println("Aqui você irá anotar 5 itens de mercado!");
        do{
            try{Produto prod = new Produto();
                System.out.print("Por favor digite o nome do " + i + "° item: ");
                prod.setNome(sc.next());
                System.out.print("Digite o valor do produto: ");
                prod.setPreco(sc.nextDouble());
                System.out.print("Digite a quantidade de itens: ");
                prod.setQuant(sc.nextInt());
                prod.calculoTotal(prod.getPreco(),prod.getQuant());
                produtos.add(prod);
                System.out.println(i + "° Item adicionado!");
                System.in.read();
                i++;
            }
            catch (InputMismatchException e){
                System.out.println("Algo foi digitado incorretamente, como a troca de '.' por ','");
            }
        }while(i <= 5);
        System.out.println("Exibição dos 5 produtos:\n");
        for(Produto p: produtos){
            System.out.println("Nome: " + p.getNome() + "\nPreço: R$" + p.getPreco() + "\nQuantidade: " + p.getQuant() + "\nTotalizando: R$" + p.getTotal() + " Para compra de todos os produtos.\n");
        }
    }
}
