package br.com.fintech;

public class Divida {
    private String descricao;
    private double valor;
    private boolean paga;

    public Divida(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
        this.paga = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public boolean isPaga() {
        return paga;
    }

    public void quitar() {
        this.paga = true;
    }
}
