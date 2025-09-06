package br.com.fintech;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Usuario usuario = new Usuario("Sassah", "sassah@email.com", "12345678900", "123456", "Equilibrado");
        Conta conta = new Conta("001", usuario.getNome(), 1000);

        List<Transacao> transacoes = new ArrayList<>();
        List<Investimento> investimentos = new ArrayList<>();
        List<MetaFinanceira> metas = new ArrayList<>();
        List<Divida> dividas = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\nBem Vindo(a) a nossa Fintech");
            System.out.println("1. Ver saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Registrar transação");
            System.out.println("5. Criar meta financeira");
            System.out.println("6. Adicionar dívida");
            System.out.println("7. Investir");
            System.out.println("8. Recomendações de IA");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + conta.getSaldo());
                    break;

                case 2:
                    System.out.print("Valor do depósito: ");
                    double dep = sc.nextDouble();
                    conta.depositar(dep);
                    System.out.println("Depósito realizado!");
                    break;

                case 3:
                    System.out.print("Valor do saque: ");
                    double saque = sc.nextDouble();
                    if (conta.sacar(saque)) {
                        System.out.println("Saque realizado!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;

                case 4:
                    System.out.print("Descrição da transação: ");
                    String desc = sc.nextLine();
                    System.out.print("Valor: ");
                    double val = sc.nextDouble();
                    transacoes.add(new Transacao(desc, val, LocalDate.now()));
                    System.out.println("Transação registrada!");
                    break;

                case 5:
                    System.out.print("Objetivo da meta: ");
                    String objetivo = sc.nextLine();
                    System.out.print("Valor meta: ");
                    double metaValor = sc.nextDouble();
                    metas.add(new MetaFinanceira(objetivo, metaValor));
                    System.out.println("Meta criada!");
                    break;

                case 6:
                    System.out.print("Descrição da dívida: ");
                    String divDesc = sc.nextLine();
                    System.out.print("Valor: ");
                    double divVal = sc.nextDouble();
                    dividas.add(new Divida(divDesc, divVal));
                    System.out.println("Dívida registrada!");
                    break;

                case 7:
                    System.out.print("Tipo de investimento: ");
                    String tipo = sc.nextLine();
                    System.out.print("Valor investido: ");
                    double invVal = sc.nextDouble();
                    System.out.print("Rendimento mensal (%): ");
                    double rendimento = sc.nextDouble();
                    investimentos.add(new Investimento(tipo, invVal, rendimento));
                    System.out.println("Investimento realizado!");
                    break;

                case 8:
                    String recomendacao = InteligenciaArtificial.recomendarInvestimento(conta.getSaldo());
                    System.out.println(recomendacao);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
