package br.com.fintech;

public class Investimento {
    private String tipo;
    private double valor;
    private double rendimentoMensal; // em %

    public Investimento(String tipo, double valor, double rendimentoMensal) {
        this.tipo = tipo;
        this.valor = valor;
        this.rendimentoMensal = rendimentoMensal;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public double getRendimentoMensal() {
        return rendimentoMensal;
    }

    public double calcularRendimento() {
        return valor * (rendimentoMensal / 100);
    }
}
