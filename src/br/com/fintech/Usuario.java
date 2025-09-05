package br.com.fintech;

public class Usuario {
    private String nome;
    private String email;
    private String cpfCnpj;
    private String senha;
    private String perfilFinanceiro;

    public Usuario(String nome, String email, String cpfCnpj, String senha){
        this.nome = nome;
        this.email = email;
        this.cpfCnpj = cpfCnpj;
        this.senha = senha;

    }

    public void cadastrarUsuario(){
        System.out.println("Cadastrando usuário" + nome);
    }

    public void validarDocumento(){
        System.out.println("Validando CPF/CNPJ" + cpfCnpj);
    }

    public void configurarPerfilFinanceiro(String perfil){
        this.perfilFinanceiro = perfil;
        System.out.println("Perfil financeiro configurado como:" + perfilFinanceiro);
    }
}
