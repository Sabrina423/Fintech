package br.com.fintech;

public class MetaFinanceira {
    private String objetivo;
    private double valorMeta;
    private double valorAtual;

    public MetaFinanceira(String objetivo, double valorMeta) {
        this.objetivo = objetivo;
        this.valorMeta = valorMeta;
        this.valorAtual = 0;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public double getValorAtual() {
        return valorAtual;
    }

    public void adicionarValor(double valor) {
        if (valor > 0) {
            valorAtual += valor;
        }
    }

    public boolean atingida() {
        return valorAtual >= valorMeta;
    }
}
