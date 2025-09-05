package br.com.fintech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Bem-vindo ao Sistema Fintech :)");


        System.out.println("\nCadastro de Usuário");
        System.out.print("Digite o nome: ");
        String nomeUsuario = leitor.nextLine();
        System.out.print("Digite o e-mail: ");
        String emailUsuario = leitor.nextLine();
        System.out.print("Digite o CPF/CNPJ: ");
        String cpfCnpjUsuario = leitor.nextLine();
        System.out.print("Digite a senha: ");
        String senhaUsuario = leitor.nextLine();

        Usuario u = new Usuario(nomeUsuario, emailUsuario, cpfCnpjUsuario, senhaUsuario);
        u.cadastrarUsuario();
        u.validarDocumento();
        u.configurarPerfilFinanceiro("Moderado");


        System.out.println("\nCadastro de Conta");
        System.out.print("Digite o número da conta: ");
        int numeroConta = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Digite o tipo da conta: ");
        String tipoConta = leitor.nextLine();
        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = leitor.nextDouble();
        leitor.nextLine();

        Conta c = new Conta(numeroConta, tipoConta, saldoInicial);
        c.consultarSaldo();
        c.exibirHistoricoTransacoes();
        c.sincronizarComBanco();


        System.out.println("\nRegistro de Transação");
        System.out.print("Digite o ID da transação: ");
        int idTransacao = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Digite o valor da transação: ");
        double valorTransacao = leitor.nextDouble();
        leitor.nextLine();
        System.out.print("Digite o tipo (Ex: Depósito, Saque): ");
        String tipoTransacao = leitor.nextLine();
        System.out.print("Digite a data: ");
        String dataTransacao = leitor.nextLine();
        System.out.print("Digite a categoria: ");
        String categoriaTransacao = leitor.nextLine();

        Transacao t = new Transacao(idTransacao, valorTransacao, tipoTransacao, dataTransacao, categoriaTransacao);
        t.executarTransacao();
        t.cancelarTransacao();
        t.filtrarTransacoesPorCategoria();


        System.out.println("\nCadastro de Meta Financeira");
        System.out.print("Digite a descrição da meta: ");
        String descricaoMeta = leitor.nextLine();
        System.out.print("Digite o valor da meta: ");
        double valorMeta = leitor.nextDouble();
        leitor.nextLine();
        System.out.print("Digite o valor atual: ");
        double valorAtualMeta = leitor.nextDouble();
        leitor.nextLine();
        System.out.print("Digite o prazo: ");
        String prazoMeta = leitor.nextLine();

        MetaFinanceira m = new MetaFinanceira(descricaoMeta, valorMeta, valorAtualMeta, prazoMeta);
        m.criarMeta();
        m.simularContribuicaoMensal();
        m.acompanharProgresso();


        System.out.println("\nCadastro de Dívida");
        System.out.print("Digite o credor: ");
        String credorDivida = leitor.nextLine();
        System.out.print("Digite o valor da dívida: ");
        double valorDivida = leitor.nextDouble();
        leitor.nextLine();
        System.out.print("Digite a data de vencimento: ");
        String dataVencimentoDivida = leitor.nextLine();
        System.out.print("Digite o status da dívida (Ex: Em aberto, Pago): ");
        String statusDivida = leitor.nextLine();

        Divida d = new Divida(credorDivida, valorDivida, dataVencimentoDivida, statusDivida);
        d.cadastrarDivida();
        d.listarDividas();
        d.calcularJuros();


        System.out.println("\nCadastro de Investimento");
        System.out.print("Digite o tipo de investimento: ");
        String tipoInvestimento = leitor.nextLine();
        System.out.print("Digite o valor investido: ");
        double valorInvestido = leitor.nextDouble();
        leitor.nextLine();
        System.out.print("Digite a rentabilidade (Ex: 0.08 para 8%): ");
        double rentabilidadeInvestimento = leitor.nextDouble();
        leitor.nextLine();
        System.out.print("Digite o prazo do investimento: ");
        String prazoInvestimento = leitor.nextLine();

        Investimento i = new Investimento(tipoInvestimento, valorInvestido, rentabilidadeInvestimento, prazoInvestimento);
        i.definirPerfilInvestidor("Conservador");
        i.sugerirInvestimentos();
        i.simularRentabilidade();


        System.out.println("\nTestes de Segurança e IA");
        System.out.print("Digite um valor de gasto para análise (ex: 550.0): ");
        double gastoParaAnalise = leitor.nextDouble();
        leitor.nextLine();
        System.out.print("Digite uma categoria de gasto para sugestão (ex: Alimentação): ");
        String categoriaParaAnalise = leitor.nextLine();

        InteligenciaArtificial ia = new InteligenciaArtificial();
        ia.analisarHabitosConsumo(gastoParaAnalise);
        ia.sugerirEconomia(categoriaParaAnalise);
        ia.assistenteVirtual();

        leitor.close();
    }
}