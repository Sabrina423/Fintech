package br.com.fintech;

public class Investimento {
    private String tipo;
    private double valorInvestido;
    private double rentabilidade;
    private String prazo;

    public Investimento(String tipo, double valorInvestido, double rentabilidade, String prazo) {
        this.tipo = tipo;
        this.valorInvestido = valorInvestido;
        this.rentabilidade = rentabilidade;
        this.prazo = prazo;
    }

    public void definirPerfilInvestidor(String perfil) {
        System.out.println("Definindo perfil do investidor como: " + perfil);
    }

    public void sugerirInvestimentos() {
        System.out.println("Sugerindo investimentos para o perfil com base no tipo: " + tipo);
    }

    public void simularRentabilidade() {
        double retorno = valorInvestido * rentabilidade;
        System.out.println("Simulação: Investindo R$ " + valorInvestido + " no " + tipo + ", retorno estimado: R$ " + retorno);
    }
}
