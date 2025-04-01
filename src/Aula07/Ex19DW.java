package Aula07;
import Aula05.Cliente;
import java.util.Scanner;

public class Ex19DW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente[] ListaCliente = new Cliente[5];
        int i = 0;

        do{
            Cliente c = new Cliente();

            System.out.print("Digite seu ID: ");
            c.id = sc.nextInt();
            System.out.print("Digite seu nome: ");
            c.nome = sc.next();
            System.out.print("Digite sua Idade: ");
            c.idade = sc.nextInt();
            System.out.print("Digite seu email: ");
            c.email = sc.next();

            ListaCliente[i] = c;
            i++;
        }
        while (i < 5);
        System.out.println("Lista de clientes acima dos 18 anos:");
        i = 0;
        do{
            if (ListaCliente[i].idade >= 18)
                System.out.println("ID: " + ListaCliente[i].id + ", Nome: " + ListaCliente[i].nome + ", Idade: " + ListaCliente[i].idade + ", Email: " + ListaCliente[i].email);
            i++;
        }
        while (i < 5);

        sc.close();
    }
}
