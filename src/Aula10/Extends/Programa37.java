package Aula10.Extends;

import Aula10.Cliente;
import Aula10.Conta;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Programa37 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        HashSet<Conta> contas = new HashSet<>();

        int id = 1;
        String choice, choice2, choice3;

        System.out.println("\n===> Cadastro Pessoas <===\n");
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

            System.out.print("Deseja cadastrar conta bancária? (Y/N): ");
            choice2 = sc.next().toLowerCase();
            if(choice2.equals("y")){
                Conta conta = new Conta();
                do {
                    System.out.print("Digite o nome do Banco: ");
                    conta.setNome(sc.next());
                    System.out.print("Digite a agencia: ");
                    conta.setAgencia(sc.nextInt());
                    System.out.print("Digite o numero: ");
                    conta.setNumero(sc.nextInt());
                    System.out.print("Digite o valor em conta: ");
                    conta.setSaldo(sc.nextDouble());
                    contas.add(conta);
                    System.out.print("Possui mais alguma conta? (Y/N): ");
                    choice3 = sc.next().toUpperCase();
                }while(!choice3.equals("N"));
                c.setContas(contas);
            }
            System.out.println("\nPessoa Cadastrada com sucesso!\n");
            System.out.print("Deseja Continuar? (Y/N): ");
            choice = sc.next().toUpperCase();

        }while(!choice.equals("N"));

        System.out.println("\nLista de pessoas Cadastradas:\n");

        for(Cliente c : clientes){
            System.out.println("Nome: " + c.getNome() + " | Idade: " + c.getIdade() + " | Email: " + c.getEmail() + "\n");
            if(c.getContas() != null){
                for(Conta conta : c.getContas()){
                    System.out.println("Nome do Banco: " + conta.getNome() + " | Conta: " + conta.getAgencia() + "-" + conta.getNumero() + " | Saldo: " + conta.getSaldo() + "\n");
                }
            }
            else{
                System.out.println("Sem contas cadastradas.");
            }
        }

        sc.close();
    }
}
