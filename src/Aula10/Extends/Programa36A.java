package Aula10.Extends;

import Aula10.Cliente;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Programa36A {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        int id = 1;
        String choice;

        do{
            Cliente c = new Cliente();

            c.setId(id);
            id++;
            System.out.print("Digite seu nome: ");
            c.setNome(sc.next());
            System.out.print("Digite sua idade: ");
            c.setIdade(sc.nextInt());
            System.out.print("Digite seu email: ");
            c.setEmail(sc.next());

            clientes.add(c);

            System.out.print("Deseja Continuar? (Y/N): ");
            choice = sc.next().toUpperCase();

        }while(!choice.equals("N"));

        System.out.println("Lista de pessoas Cadastradas:\n");

        for(Cliente c : clientes){
            System.out.println("Nome: " + c.getNome() + " | Idade: " + c.getIdade() + " | Email: " + c.getEmail() + "\n");
        }

        sc.close();
    }
}
