package Aula10;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Programa35 {
    public static void main(String[] args) throws IOException{
        HashMap<Integer, Produto> Produtos = new HashMap<Integer, Produto>();
        Scanner sc = new Scanner(System.in);

        int id = 1;
        String choice, choice2;

        System.out.println("\n ===> Cadastro de Produtos <===\n");
        do{
            Produto p = new Produto();

            p.setId(id);
            System.out.print("Digite o nome do produto: ");
            p.setNome(sc.next());
            System.out.print("Digite o Preço: ");
            p.setPreco(sc.nextDouble());
            System.out.print("Digite a quantidade: ");
            p.setQuantidade(sc.nextInt());

            System.out.print("Este produto tem categoria? (Y/N): ");
            choice2 = sc.next().toUpperCase();
            if(choice2.equals("Y")){
                Categoria c = new Categoria();
                System.out.print("Digite o id da categoria: ");
                c.setId(sc.nextInt());
                System.out.print("Digite o nome da categoria: ");
                c.setNome(sc.next());
                p.setCategoria(c);
            }
            Produtos.put(id, p);
            id++;

            System.out.println("\nProduto Cadastrado!\n");
            System.out.print("Deseja Continuar? (Y/N): ");
            choice = sc.next().toUpperCase();

        }while(!choice.equals("N"));
        System.out.println("\nLista de Produtos cadastrados:\n");

        Produtos.forEach((key, value) -> {
            System.out.println(key + "= Nome: " + value.getNome() + " | Preço: " + value.getPreco() + " | Quantidade: " + value.getQuantidade());
            if(value.getCategoria() != null){
                System.out.println("    Categoria: " + value.getCategoria().getNome() + " | Id: " + value.getCategoria().getId() + "\n");
            }
            else
                System.out.println("    Produto sem categoria.\n");
        });
    }
}
