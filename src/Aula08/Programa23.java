package Aula08;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa23 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> ListaClientes = new ArrayList<>();

        int opcao;
        int id = 0;
        int n;
        int s = 2;
        int choice;
        int choice2;
        String cliente1 = null;
        String cliente2 = null;
        double valor;
        boolean existeCliente = false;

        do{
            System.out.print("===>Bem Vindo ao Banco Macgyver<===\n\n");
            System.out.print("Escolha uma das opções abaixo:\n");
            System.out.print("1 - Cadastrar Cliente\n" +
                    "2 - Depósito\n" +
                    "3 - Saque\n" +
                    "4 - Transferência\n" +
                    "5 - Consulta de Saldo\n" +
                    "6 - Sair\n");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            if(opcao == 1){
                Cliente cliente = new Cliente();
                ContaBancaria conta = new ContaBancaria();

                id++;
                cliente.setId(id);

                System.out.print("Digite seu nome: ");
                cliente.setNome(sc.next());

                System.out.print("digite sua idade: ");
                cliente.setIdade(sc.nextInt());

                conta.setAgencia(555);
                n = 50000000 + s;
                conta.setNumero(n);
                conta.setSaldo(0.00);
                s = s + 3;
                cliente.setConta(conta);
                ListaClientes.add(cliente);

                System.out.println("Conta criada com sucesso!");
                System.in.read();
            }
            else if(opcao == 2){
                System.out.println("Clientes cadastrados");
                for(Cliente c: ListaClientes){
                    System.out.println("Id: " + c.getId() + " | Nome: " + c.getNome() + " | Saldo: " + c.getConta().getSaldo());
                }
                System.out.print("Digite o Id de quem deseja realizar o depósito: ");
                choice = sc.nextInt();
                System.out.print("Digite o valor do depósito: ");
                valor = sc.nextInt();

                existeCliente = false;
                for (Cliente c: ListaClientes){
                    if (c.getId() == choice){
                        c.getConta().depositar(valor);
                        existeCliente = true;
                        break;
                    }
                }
                if (existeCliente){
                    System.out.println("Deposito concluído!");
                }
                else
                    System.out.println("Conta não encontrada.");

                System.in.read();

            }
            else if(opcao == 3){
                System.out.println("Clientes cadastrados");
                for(Cliente c: ListaClientes){
                    System.out.println("Id: " + c.getId() + " | Nome: " + c.getNome() + " | Saldo: " + c.getConta().getSaldo());
                }
                System.out.print("Digite o Id de quem deseja realizar o saque: ");
                choice = sc.nextInt();
                System.out.print("Digite o valor do saque: ");
                valor = sc.nextInt();

                existeCliente = false;
                for (Cliente c: ListaClientes){
                    if (c.getId() == choice){
                        c.getConta().sacar(valor);
                        existeCliente = true;
                        break;
                    }
                }
                if (existeCliente){
                    System.out.println("Saque concluído!");
                }
                else
                    System.out.println("Conta não encontrada.");

                System.in.read();
            }
            else if(opcao == 4){
                System.out.println("Clientes cadastrados");
                for(Cliente c: ListaClientes){
                    System.out.println("Id: " + c.getId() + " | Nome: " + c.getNome() + " | Saldo: " + c.getConta().getSaldo());
                }
                System.out.print("Digite o Id de origem: ");
                choice = sc.nextInt();
                System.out.print("Digite o id da pessoa para transferência: ");
                choice2 = sc.nextInt();
                System.out.print("Digite o valor da transferência: ");
                valor = sc.nextInt();

                for (Cliente c: ListaClientes){
                    if (c.getId() == choice){
                        if(c.getConta().getSaldo() >= valor) {
                            c.getConta().sacar(valor);
                            for (Cliente d : ListaClientes) {
                                if (d.getId() == choice2) {
                                    d.getConta().depositar(valor);
                                    System.out.println("Transferência concluída!");
                                    break;
                                }
                            }
                        }
                        else{
                            System.out.println("Transferência Interrompida!");
                        }
                    }
                    break;
                }
                System.in.read();
            }
            else if(opcao == 5){
                System.out.println("Clientes cadastrados");
                for(Cliente c: ListaClientes){
                    System.out.println("Id: " + c.getId() + " | Nome: " + c.getNome());
                }
                System.out.print("Digite o seu Id: ");
                choice = sc.nextInt();
                for (Cliente c: ListaClientes){
                    if (c.getId() == choice){
                        c.getConta().consultarSaldo();
                        break;
                    }
                }
                System.in.read();
            }
        }while(opcao != 6);

        sc.close();
    }
}