package Aula10.Extends;

import Aula10.Produto;
import Aula10.Categoria;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Programa38 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        HashSet<Categoria> categorias = new HashSet<>();

        int id = 1;
        String choice, choice2, choice3;

        System.out.println("\n ===> Cadastro de Produtos <===\n");
        do{
            Produto p = new Produto();

            p.setId(id);
            id++;
            System.out.print("Digite o nome do produto: ");
            p.setNome(sc.next());
            System.out.print("Digite o Preço: ");
            p.setPreco(sc.nextDouble());
            System.out.print("Digite a quantidade: ");
            p.setQuantidade(sc.nextInt());

            System.out.print("Este produto tem categoria? (Y/N): ");
            choice2 = sc.next().toUpperCase();
            if(choice2.equals("Y")){
                do {
                    Categoria c = new Categoria();
                    System.out.print("Digite o id da categoria: ");
                    c.setId(sc.nextInt());
                    System.out.print("Digite o nome da categoria: ");
                    c.setNome(sc.next());
                    categorias.add(c);
                    System.out.print("Possui mais Categorias? (Y/N): ");
                    choice3 = sc.next().toUpperCase();
                }while(choice3.equals("N"));
                p.setCategorias(categorias);
            }
            System.out.println("\nProduto Cadastrado!\n");
            System.out.print("Deseja Continuar? (Y/N): ");
            choice = sc.next().toUpperCase();

        }while(!choice.equals("N"));

        System.out.println("\nLista de Produtos cadastrados:\n");
        for(Produto p : produtos){
            System.out.println("Nome: " + p.getNome() + " | preço: " + p.getPreco() + " | Quantidade: " + p.getQuantidade() + "\n");
            if(p.getCategorias() != null){
                for(Categoria c : p.getCategorias()){
                    System.out.println("Categoria: " + c.getId() + " | " + c.getNome() + "\n");
                }
            }
            else{
                System.out.println("Produto sem categoria. \n");
            }
        }

        sc.close();
    }
}
