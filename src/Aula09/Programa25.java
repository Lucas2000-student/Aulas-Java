package Aula09;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa25 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> ListaPessoa = new ArrayList<>();

        int opcao;
        do{
            System.out.println("\n===> Cadastro de Pessoas <===");
            System.out.println("1 - Pessoa Física.\n" +
                    "2 - Pessoa Juridica.\n" +
                    "3 - Exibir pessoas cadastradas.\n" +
                    "4 - Sair.");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            System.out.print("\n");
            if(opcao == 1){
                PessoaFisica pf = new PessoaFisica();

                System.out.print("Digite seu nome: ");
                pf.setNome(sc.next());
                System.out.print("Digite sua idade: ");
                pf.setIdade(sc.nextInt());
                System.out.print("Digite seu CPF: ");
                pf.setCpf(sc.next());
                System.out.print("Digite seu RG: ");
                pf.setRg(sc.next());

                ListaPessoa.add(pf);
                System.out.println("Pessoa Física cadastrada!");
                System.in.read();
            }
            else if(opcao == 2){
                PessoaJuridica pj = new PessoaJuridica();

                System.out.print("Digite seu nome: ");
                pj.setNome(sc.next());
                System.out.print("Digite sua idade: ");
                pj.setIdade(sc.nextInt());
                System.out.print("Digite seu CNPJ: ");
                pj.setCnpj(sc.next());
                System.out.print("Digite sua Inscrição Estadual: ");
                pj.setInscricaoEstadual(sc.next());

                ListaPessoa.add(pj);
                System.out.println("Pessoa Juridica cadastrada!");
                System.in.read();
            }
            else if(opcao == 3){
                System.out.println("Lista de pessoas cadastradas: ");
                for(Pessoa p : ListaPessoa){
                    if(p instanceof PessoaFisica){
                        System.out.println("Pessoa Física:");
                    }
                    else{
                        System.out.println("Pessoa Juridica:");
                    }
                    System.out.println("Nome: " + p.getNome());
                    System.out.println("Idade: " + p.getIdade());
                    if(p instanceof PessoaFisica){
                        PessoaFisica pf = (PessoaFisica)p;
                        System.out.println("CPF: " + pf.getCpf());
                        System.out.println("RG: " + pf.getRg());
                    }
                    else{
                        PessoaJuridica pj = (PessoaJuridica)p;
                        System.out.println("CNPJ: " + pj.getCnpj());
                        System.out.println("Inscricao Estadual: " + pj.getInscricaoEstadual());
                    }

                }
                System.in.read();
            }

        }while(opcao != 4);

        sc.close();
    }
}
