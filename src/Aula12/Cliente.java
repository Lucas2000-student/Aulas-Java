package Aula12;

import java.util.HashMap;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private HashMap<Integer, Conta> Contas = new HashMap<Integer, Conta>();

    public HashMap<Integer, Conta> getContas() {
        return Contas;
    }

    public void setContas(HashMap<Integer, Conta> contas) {
        Contas = contas;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente() {
    }

    public Cliente(HashMap<Integer, Conta> contas, String cpf, String email, String nome) {
        Contas = contas;
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
    }
}
