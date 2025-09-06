package br.com.fintech;

public class Usuario {
    private String nome;
    private String email;
    private String cpfCnpj;
    private String senha;
    private String perfilFinanceiro;

    public Usuario(String nome, String email, String cpfCnpj, String senha, String perfilFinanceiro) {
        this.nome = nome;
        this.email = email;
        this.cpfCnpj = cpfCnpj;
        this.senha = senha;
        this.perfilFinanceiro = perfilFinanceiro;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public String getPerfilFinanceiro() {
        return perfilFinanceiro;
    }

    public boolean autenticar(String email, String senha) {
        return this.email.equals(email) && this.senha.equals(senha);
    }
}
