package Aula10;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Programa34 {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Cliente> Clientes = new HashMap<Integer, Cliente>();
        Scanner sc = new Scanner(System.in);

        int id = 1;
        String choice, choice2;

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

            System.out.print("Deseja cadastrar conta bancária? (Y/N): ");
            choice2 = sc.next().toLowerCase();
            if(choice2.equals("y")){
                Conta conta = new Conta();
                System.out.print("Digite o nome do Banco: ");
                conta.setNome(sc.next());
                System.out.print("Digite a agencia: ");
                conta.setAgencia(sc.nextInt());
                System.out.print("Digite o numero: ");
                conta.setNumero(sc.nextInt());
                System.out.print("Digite o valor em conta: ");
                conta.setSaldo(sc.nextDouble());
                c.setConta(conta);
            }
            Clientes.put(id, c);
            id++;
            System.out.println("\nPessoa Cadastrada com sucesso!\n");
            System.out.print("Deseja Continuar? (Y/N): ");
            choice = sc.next().toUpperCase();

        }while(!choice.equals("N"));

        System.out.println("\nLista de pessoas Cadastradas:\n");
        Clientes.forEach((key, value) -> {
            System.out.println(key + "= Nome: " + value.getNome() + " | Idade: " + value.getIdade() + " | email: " + value.getEmail());
            if(value.getConta() != null){
                System.out.println("   Banco: " + value.getConta().getNome() + " conta: " + value.getConta().getAgencia() + "-" + value.getConta().getNumero() + " Valor em conta: R$" + value.getConta().getSaldo() + "\n");
            }
            else
                System.out.println("   Cliente sem conta bancária.\n");
        });
        sc.close();
    }
}
