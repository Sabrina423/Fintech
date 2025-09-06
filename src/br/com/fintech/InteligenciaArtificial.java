package br.com.fintech;

public class InteligenciaArtificial {
    public static String recomendarInvestimento(double saldo) {
        if (saldo < 500) {
            return "Recomendação: Poupança";
        } else if (saldo < 5000) {
            return "Recomendação: Tesouro Direto";
        } else {
            return "Recomendação: Fundos de Investimento";
        }
    }
}
