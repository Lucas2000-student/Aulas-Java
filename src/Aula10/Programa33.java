package Aula10;
import java.util.HashMap;
import java.io.IOException;
import java.util.Scanner;

public class Programa33 {
    public static void main(String[] args) throws IOException{
        HashMap<Integer, Cliente> lista = new HashMap<Integer, Cliente>();
        Scanner sc = new Scanner(System.in);

        int id = 1;
        String choice;

        System.out.println("\n===> Cadastro Pessoas <===\n");
        do{
            Cliente c = new Cliente();

            c.setId(id);
            System.out.print("Digite seu nome: ");
            c.setNome(sc.next());
            System.out.print("Digite sua idade: ");
            c.setIdade(sc.nextInt());
            System.out.print("Digite seu email: ");
            c.setEmail(sc.next());

            lista.put(id, c);
            id++;

            System.out.print("Deseja Continuar? (Y/N): ");
            choice = sc.next().toUpperCase();

        }while(!choice.equals("N"));

        System.out.println("Lista de pessoas Cadastradas:\n");
        lista.forEach((key, value) -> {
            System.out.println(key + "= Nome: " + value.getNome() + " Idade: " + value.getIdade() + " email: " + value.getEmail());
        });
        sc.close();
    }
}
