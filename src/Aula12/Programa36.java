package Aula12;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Programa36 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Cliente> Clientes = new HashMap<>();
        HashMap<Integer, Conta> Contas = new HashMap<>();

        int IDcliente = 1, IDconta = 1;
        int opc1 = 0, opc2 = 0, opc3 = 0, opc4 = 0;
        int num = 444000;

        do{
            System.out.println("\n= = = = Banco FIAP = = = =");
            System.out.println("1 - Cadastrar Cliente.\n" +
                               "2 - Efetuar depósito.\n" +
                               "3 - Efetuar Saque.\n" +
                               "4 - Deletar Cliente.\n" +
                               "5 - Ver Extrato.\n" +
                               "6 - Sair.\n");
            System.out.print("Digite a opção desejada: ");
            opc1 = sc.nextInt();
            if(opc1 == 1){
                Cliente c = new Cliente();
                System.out.print("Digite o nome: ");
                c.setNome(sc.next());
                System.out.print("Digite o CPF: ");
                c.setCpf(sc.next());
                System.out.print("Digite o Email: ");
                c.setEmail(sc.next());
                System.out.println("\n 1 - Conta Corrente.\n" +
                                      "2 - Conta Poupança.\n" +
                                      "3 - Ambas.\n");
                System.out.print("Digite a opção desejada: ");
                opc2 = sc.nextInt();
                if(opc2 == 1){
                    ContaCorrente cc = new ContaCorrente();
                    cc.setAgencia(555);
                    cc.setNumero(num);
                    cc.setChequeEspecial(1000.00);
                    Contas.put(IDconta, cc);
                }
                else if(opc2 == 2){
                    ContaPoupanca cp = new ContaPoupanca();
                    cp.setAgencia(556);
                    cp.setNumero(num);
                    cp.setRendimento(0.55);
                    Contas.put(IDconta, cp);
                }
                else if(opc2 == 3){
                    ContaCorrente cc = new ContaCorrente();
                    cc.setAgencia(555);
                    cc.setNumero(num);
                    cc.setChequeEspecial(1000.00);
                    Contas.put(IDconta, cc);
                    IDconta++;
                    num = num + 3;
                    ContaPoupanca cp = new ContaPoupanca();
                    cp.setAgencia(556);
                    cp.setNumero(num);
                    cp.setRendimento(0.55);
                    Contas.put(IDconta, cp);
                }
                c.setContas(Contas);
                Clientes.put(IDcliente, c);
                IDcliente++;
                IDconta++;
                num = num + 3;
                System.out.println("\nCliente Cadastrado com sucesso!");
                System.in.read();
            }
            else if(opc1 == 2){
                Clientes.forEach((key, value) ->{
                    System.out.println("ID: " + key + " | Nome: " + value.getNome() + " | CPF: " + value.getCpf());
                });
                System.out.println("Digite o ID desejado: ");
                opc3 = sc.nextInt();

                if(Clientes.containsKey(opc3)){
                    System.out.println("Contas cadastradas: ");
                    Clientes.get(opc3).getContas().forEach((key, value) ->{
                        System.out.println("ID: " + key + " | Conta: " + value.getAgencia() + "-" + value.getNumero());
                    });
                    System.out.print("Digite o ID desejado: ");
                    opc4 = sc.nextInt();
                    if(Contas.containsKey(opc4)){
                        System.out.println("Digite o valor do depósito: ");
                        Contas.get(opc4).deposito(sc.nextDouble());
                    }
                }
                System.out.println("Valor depositado com sucesso!");
                System.in.read();
            }
            else if(opc1 == 3){
                Clientes.forEach((key, value) ->{
                    System.out.println("ID: " + key + " | Nome: " + value.getNome() + " | CPF: " + value.getCpf());
                });
                System.out.println("Digite o ID desejado: ");
                opc3 = sc.nextInt();

                if(Clientes.containsKey(opc3)){
                    System.out.println("Contas cadastradas: ");
                    Clientes.get(opc3).getContas().forEach((key, value) ->{
                        System.out.println("ID: " + key + " | Conta: " + value.getAgencia() + "-" + value.getNumero() + "Saldo: " + value.getSaldo());
                    });
                    System.out.print("Digite o ID desejado: ");
                    opc4 = sc.nextInt();
                    if(Contas.containsKey(opc4)){
                        System.out.println("Digite o valor do Saque: ");
                        Contas.get(opc4).sacar(sc.nextDouble());
                    }
                }
                System.in.read();
            }
            else if(opc1 == 4){
                Clientes.forEach((key, value) ->{
                    System.out.println("ID: " + key + " | Nome: " + value.getNome() + " | CPF: " + value.getCpf() + " | Email: " + value.getEmail());
                });
                System.out.println("Digite o ID desejado: ");
                opc3 = sc.nextInt();
                Clientes.remove(opc3);
                System.out.println("Cliente removido com sucesso!");
            }
            else if(opc1 == 5){
                Clientes.forEach((key, value) ->{
                    System.out.println("ID: " + key + " | Nome: " + value.getNome() + " | CPF: " + value.getCpf());
                });
                System.out.println("Digite o ID desejado: ");
                opc3 = sc.nextInt();

                if(Clientes.containsKey(opc3)){
                    System.out.println("Contas cadastradas: ");
                    Clientes.get(opc3).getContas().forEach((key, value) ->{
                        System.out.println("ID: " + key + " | Conta: " + value.getAgencia() + "-" + value.getNumero() + " | Saldo: " + value.getSaldo());
                        System.out.println(value.getExtrato());
                    });
                }
                System.in.read();
            }
        }while(opc1 != 6);

    }
}
