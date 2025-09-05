package br.com.fintech;

public class Conta {
    private int numeroConta;
    private String tipoConta;
    private double saldo;

    public Conta (int numeroConta, String tipoConta, double saldo){
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual da conta" + numeroConta + "R$" + saldo);
    }

    public void exibirHistoricoTransacoes(){
        System.out.println("Exibindo histórico de transações da conta" + numeroConta);
    }

    public void sincronizarComBanco(){
        System.out.println("Sincronizando  dados da conta" + numeroConta);
    }
}
