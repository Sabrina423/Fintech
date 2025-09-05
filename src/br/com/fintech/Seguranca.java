package br.com.fintech;

public class Seguranca {
    private boolean biometriaAtivada;
    private boolean autenticacao2FA;

    public Seguranca(boolean biometriaAtivada, boolean autenticacao2FA) {
        this.biometriaAtivada = biometriaAtivada;
        this.autenticacao2FA = autenticacao2FA;
    }

    public void autenticarUsuario() {
        System.out.println("Autenticando usuário com segurança avançada...");
    }

    public void criptografarDados() {
        System.out.println("Criptografando dados do usuário...");
    }

    public void bloquearConta() {
        System.out.println("Bloqueando conta por tentativas suspeitas...");
    }
}
