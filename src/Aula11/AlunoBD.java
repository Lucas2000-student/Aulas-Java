package Aula11;

import java.sql.*;

public class AlunoBD {

    public Connection ConexaoBD(){
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm560179", "fiap25");

            if(conn!=null)
                System.out.println("Dados Salvos com Sucesso!");
            else
                System.out.println("Falha na conexão com o Banco de Dados!");


        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void InserirAluno(Aluno a){

        Connection conn = ConexaoBD();

        Statement statement;

        try {
            String query = String.format("insert into TB_JAVA_ALUNO (ID_ALUNO,NOME_ALUNO,RA_ALUNO,CURSO_ALUNO) values('%s','%s','%s','%s')", a.getId(), a.getNome(), a.getRa(), a.getCurso());

            statement = conn.createStatement();

            statement.executeUpdate(query);

            System.out.println("Registro incluído com sucesso!");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void ExcluirAluno(Aluno a){
        Connection conn = ConexaoBD();
        Statement statement;
        try {
            String query = String.format("delete from TB_JAVA_ALUNO where ID_ALUNO = %s", a.getId());

            statement = conn.createStatement();

            statement.executeUpdate(query);

            System.out.println("Registro excluído com sucesso!");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void ListarAlunos(){
        Connection conn = ConexaoBD();

        Statement statement;

        ResultSet rs=null;

        try {
            String query= "select * from TB_JAVA_ALUNO";

            statement=conn.createStatement();

            rs=statement.executeQuery(query);

            while(rs.next()){
                System.out.print("ID: " + rs.getInt("ID_ALUNO")+" ");
                System.out.print(" | Nome: " +rs.getString("NOME_ALUNO")+ " ");
                System.out.print(" | RA: " +rs.getString("RA_ALUNO")+ " ");
                System.out.println(" | Curso: " +rs.getString("CURSO_ALUNO"));
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void ListarAluno(String RA){
        Connection conn = ConexaoBD();

        Statement statement;

        ResultSet rs=null;

        try {
            String query= "select * from TB_JAVA_ALUNO where RA_ALUNO = '" + RA + "'";

            statement=conn.createStatement();

            rs=statement.executeQuery(query);

            while(rs.next()){
                System.out.print("ID: " + rs.getString("ID_ALUNO")+" ");
                System.out.print(" | Nome: " +rs.getString("NOME_ALUNO")+ " ");
                System.out.print(" | RA: " +rs.getString("RA_ALUNO")+ " ");
                System.out.println(" | Curso: " +rs.getString("CURSO_ALUNO"));
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public void AlterarAluno(Aluno a){
        Connection conn = ConexaoBD();

        Statement statement;

        try {
            String query = String.format("update TB_JAVA_ALUNO set NOME_ALUNO = '%s', RA_ALUNO = '%s', CURSO_ALUNO = '%s' where ID_ALUNO = '%s'", a.getNome(), a.getRa(), a.getCurso(), a.getId());

            statement = conn.createStatement();

            statement.executeUpdate(query);

            System.out.println("Registro atualizado com sucesso!");
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
