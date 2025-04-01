package Aula09;

public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String InscricaoEstadual;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return InscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        InscricaoEstadual = inscricaoEstadual;
    }

    public PessoaJuridica() {}

    public PessoaJuridica(String nome, int idade, String cnpj, String inscricaoEstadual) {
        super(nome, idade);
        this.cnpj = cnpj;
        InscricaoEstadual = inscricaoEstadual;
    }
}
