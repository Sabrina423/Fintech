package br.com.fintech;

public class Transacao {
    private int id;
    private double valor;
    private String tipo;
    private String data;
    private String categoria;

    public Transacao(int id, double valor, String tipo, String data, String categoria ){
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
        this.data = data;
        this.categoria = categoria;
    }

    public void executarTransacao(){
        System.out.println("Executando transação: " + tipo + "de R$" + valor + "em" + data);
    }

    public void cancelarTransacao(){
        System.out.println("Cancelando transação: " + id);
    }

    public void filtrarTransacoesPorCategoria(){
        System.out.println("Filtrando transações da categoria " + categoria);
    }
}
