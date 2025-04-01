package Aula10;

import java.util.HashSet;

public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private String email;
    private Conta conta;
    private HashSet<Conta> Contas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public HashSet<Conta> getContas() {
        return Contas;
    }

    public void setContas(HashSet<Conta> contas) {
        Contas = contas;
    }

    public void ExibirNomeIdade(){
        System.out.println("Nome: " + this.nome + "Idade: "+ this.idade);
    }

    public Cliente() {
    }

    public Cliente(int id, String nome, int idade, String email) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
}
