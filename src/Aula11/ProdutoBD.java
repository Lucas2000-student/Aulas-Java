package Aula11;

import java.sql.*;

public class ProdutoBD {
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

    public void InserirProduto(Produto p){

        Connection conn = ConexaoBD();

        Statement statement;

        try {
            String query = String.format("insert into TB_JAVA_PRODUTOS (ID_PRODUTO,NOME_PRODUTO,VALOR_PRODUTO,QUANT_PRODUTO) values('%s','%s','%.2f','%s')", p.getId(), p.getNome(), p.getPreco(), p.getQuantidade());

            statement = conn.createStatement();

            statement.executeUpdate(query);

            System.out.println("Registro incluído com sucesso!");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void ExcluirProduto(Produto p){
        Connection conn = ConexaoBD();
        Statement statement;
        try {
            String query = String.format("delete from TB_JAVA_PRODUTOS where ID_PRODUTO = %s", p.getId());

            statement = conn.createStatement();

            statement.executeUpdate(query);

            System.out.println("Registro excluído com sucesso!");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void ListarProdutos(){
        Connection conn = ConexaoBD();

        Statement statement;

        ResultSet rs=null;

        try {
            String query= "select * from TB_JAVA_PRODUTOS";

            statement=conn.createStatement();

            rs=statement.executeQuery(query);

            while(rs.next()){
                System.out.print("ID: " + rs.getInt("ID_PRODUTO")+" ");
                System.out.print(" | Nome: " +rs.getString("NOME_PRODUTO")+ " ");
                System.out.print(" | Valor: " +rs.getString("VALOR_PRODUTO")+ " ");
                System.out.println(" | Quant: " +rs.getString("QUANT_PRODUTO"));
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void ListarProduto(String nome){
        Connection conn = ConexaoBD();

        Statement statement;

        ResultSet rs=null;

        try {
            String query= "select * from TB_JAVA_PRODUTOS where NOME_PRODUTO = '" + nome + "'";

            statement=conn.createStatement();

            rs=statement.executeQuery(query);

            while(rs.next()){
                System.out.print("ID: " + rs.getInt("ID_PRODUTO")+" ");
                System.out.print(" | Nome: " +rs.getString("NOME_PRODUTO")+ " ");
                System.out.print(" | Valor: " +rs.getString("VALOR_PRODUTO")+ " ");
                System.out.println(" | Quant: " +rs.getString("QUANT_PRODUTO"));
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public void AlterarProduto(Produto p){
        Connection conn = ConexaoBD();

        Statement statement;

        try {
            String query = String.format("update TB_JAVA_PRODUTOS SET NOME_PRODUTO = '%s', VALOR_PRODUTO = '%2f', QUANT_PRODUTO = '%s'  where ID_PRODUTO = '%s'   ",p.getNome(), p.getPreco(), p.getQuantidade(), p.getId());

            statement = conn.createStatement();

            statement.executeUpdate(query);

            System.out.println("Registro atualizado com sucesso!");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
