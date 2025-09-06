package br.com.fintech;

public class Seguranca {
    public static boolean validarSenha(String senha) {
        return senha != null && senha.length() >= 6;
    }
}
