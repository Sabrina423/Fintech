package br.com.fintech;

public class InteligenciaArtificial {


    public void analisarHabitosConsumo(double valorGasto) {
        System.out.println("\n--- Análise de Hábitos de Consumo ---");
        if (valorGasto > 500.0) {
            System.out.println("Alerta: gasto excessivo de R$" + valorGasto + " detectado!");
        } else {
            System.out.println("Gasto de R$" + valorGasto + " está dentro do limite.");
        }
    }


    public void sugerirEconomia(String categoria) {
        System.out.println("\n--- Sugestão de Economia ---");
        if (categoria.equalsIgnoreCase("Transporte")) {
            System.out.println("Sugestão: economize reduzindo despesas em transporte.");
        } else if (categoria.equalsIgnoreCase("Alimentação")) {
            System.out.println("Sugestão: prepare mais refeições em casa para economizar em alimentação.");
        } else {
            System.out.println("Sugestão: revise seus gastos na categoria " + categoria + ".");
        }
    }


    public void assistenteVirtual() {
        System.out.println("Assistente financeiro virtual pronto para ajudar :)");
    }
}