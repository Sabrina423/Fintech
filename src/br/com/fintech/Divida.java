package br.com.fintech;

public class Divida {
    private String credor;
    private double valor;
    private String dataVencimento;
    private String status;

    public  Divida(String credor, double valor, String dataVencimento, String status){
        this.credor = credor;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.status = status;
    }

    public void cadastrarDivida() {
        System.out.println("Cadastrando dívida com " + credor + " no valor de R$ " + valor);
    }

    public void listarDividas() {
        System.out.println("Listando dívida com " + credor + ": " + status + " - Vencimento: " + dataVencimento);
    }

    public void calcularJuros(){
        System.out.println("Calculando juros da dívida com " + credor);
    }
}
