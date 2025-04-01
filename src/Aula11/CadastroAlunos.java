package Aula11;

import java.io.IOException;
import java.util.Scanner;

public class CadastroAlunos {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        AlunoBD BD = new AlunoBD();

        int opc = 0, id = 1;
        String RA;

        do{
            System.out.println("\n=== Cadastro de Alunos Fiap! ===\n");
            System.out.println("1 - Cadastrar aluno.\n" +
                    "2 - Atualizar aluno.\n" +
                    "3 - Excluir aluno.\n" +
                    "4 - Listar alunos.\n" +
                    "5 - Mostrar um aluno.\n" +
                    "6 - Sair.");
            System.out.print("Digite a opção desejada: ");
            opc = sc.nextInt();

            if (opc == 1){

                System.out.println("\nCadastro de Aluno.");
                aluno.setId(id);
                id++;
                System.out.print("Digite o nome: ");
                aluno.setNome(sc.next());
                System.out.print("Digite o RA: ");
                aluno.setRa(sc.next());
                System.out.print("Digite o curso: ");
                aluno.setCurso(sc.next());
                BD.InserirAluno(aluno);
                System.in.read();
            }
            else if (opc == 2){
                BD.ListarAlunos();
                System.out.print("Digite o ID de quem você deseja atualizar: ");
                aluno.setId(sc.nextInt());
                System.out.print("Digite o nome: ");
                aluno.setNome(sc.next());
                System.out.print("Digite o RA: ");
                aluno.setRa(sc.next());
                System.out.print("Digite o curso: ");
                aluno.setCurso(sc.next());
                BD.AlterarAluno(aluno);
                System.in.read();
            }
            else if (opc == 3){
                BD.ListarAlunos();
                System.out.print("Digite o ID de quem você deseja excluir: ");
                aluno.setId(sc.nextInt());
                BD.ExcluirAluno(aluno);
                System.in.read();
            }
            else if (opc == 4){
                System.out.println("Lista de Alunos cadastrados: ");
                BD.ListarAlunos();
                System.in.read();
            }
            else if (opc == 5){
                System.out.print("Digite o RM do aluno: ");
                RA = sc.next();
                BD.ListarAluno(RA);
                System.in.read();
            }
        }while(opc != 6);
    }
}
