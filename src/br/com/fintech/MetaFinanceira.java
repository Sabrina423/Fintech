package br.com.fintech;

public class MetaFinanceira {
    private String descricao;
    private double valorMeta;
    private double valorAtual;
    private String prazo;

    public MetaFinanceira(String descricao, double valorMeta, double valorAtual, String prazo){
        this.descricao = descricao;
        this.valorMeta = valorMeta;
        this.valorAtual = valorAtual;
        this.prazo = prazo;
    }

    public void criarMeta(){
        System.out.println("Criando meta: " + descricao + " no valor de R$" + valorMeta);
    }

    public void simularContribuicaoMensal(){
        double restante = valorMeta - valorAtual;
        System.out.println("Simulando contribuição mensal para atingir R$ " +valorMeta + ". Falta R$ " + restante);
    }

    public void acompanharProgresso(){
        System.out.println("Meta " + descricao + " - Progresso: R$ " + valorMeta);
    }
}
