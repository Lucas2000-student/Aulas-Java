package Aula11;

import java.io.IOException;
import java.util.Scanner;

public class CadastroProdutos {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
        ProdutoBD BD = new ProdutoBD();

        int opc = 0, id = 1;
        String Nome;

        do{
            System.out.println("\n=== Cadastro de Produtos! ===\n");
            System.out.println("1 - Cadastrar Produtos.\n" +
                    "2 - Atualizar produtos.\n" +
                    "3 - Excluir produtos.\n" +
                    "4 - Listar produtos.\n" +
                    "5 - Mostrar um produto.\n" +
                    "6 - Sair.");
            System.out.print("Digite a opção desejada: ");
            opc = sc.nextInt();
            if (opc == 1){

                System.out.println("\nCadastro de Produto.");
                produto.setId(id);
                id++;
                System.out.print("Digite o nome: ");
                produto.setNome(sc.next());
                System.out.print("Digite o valor: ");
                produto.setPreco(sc.nextDouble());
                System.out.print("Digite a quantidade: ");
                produto.setQuantidade(sc.nextInt());
                BD.InserirProduto(produto);
                System.in.read();
            }
            else if (opc == 2){
                BD.ListarProdutos();
                System.out.print("Digite o ID de quem você deseja atualizar: ");
                produto.setId(sc.nextInt());
                System.out.print("Digite o nome: ");
                produto.setNome(sc.next());
                System.out.print("Digite o valor: ");
                produto.setPreco(sc.nextDouble());
                System.out.print("Digite a quantidade: ");
                produto.setQuantidade(sc.nextInt());
                BD.AlterarProduto(produto);
                System.in.read();
            }
            else if (opc == 3){
                BD.ListarProdutos();
                System.out.print("Digite o ID de qual produto deseja excluir: ");
                produto.setId(sc.nextInt());
                BD.ExcluirProduto(produto);
                System.in.read();
            }
            else if (opc == 4){
                System.out.println("Lista de Alunos cadastrados: ");
                BD.ListarProdutos();
                System.in.read();
            }
            else if (opc == 5){
                System.out.print("Digite o nome do produto: ");
                Nome = sc.next();
                BD.ListarProduto(Nome);
                System.in.read();
            }
        }while(opc != 6);
    }
}
