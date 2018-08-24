/*
Crie uma classe para implementar uma conta corrente. A classe deve
possuir os seguintes atributos: número da conta, nome do correntista e
saldo. Os métodos são os seguintes: alterarNome, depósito e saque; No
construtor, saldo é opcional, com valor default zero e os demais atributos
são obrigatórios. */
package exercicio5;

import java.util.Scanner;

/**
 *
 * @author Mulero
 */
public class Teste5 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String nome;
        double deposito, saque;
        int conta, opcao;

        System.out.println("Bem-vindo ao sistema de abertura de conta corrente");
        System.out.println("Por Favor preencha os campos abaixo!");

        System.out.print("\nDigite seu nome: ");
        nome = read.nextLine();

        System.out.print("Digite o número da conta: ");
        conta = read.nextInt();

        Conta corrente = new Conta(conta, nome);

        System.out.println("\nSua conta foi criada com sucesso!");
        System.out.println("\nSaldo atual: " + corrente.getSaldo());

        do {
            System.out.println("\nOpções: ");
            System.out.println("1 - Deposito");
            System.out.println("2 - Saque");
            System.out.println("3 - Alterar nome");
            System.out.println("0 - Finalizar/Sair");

            System.out.print("Escolha uma opção: ");
            opcao = read.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("\nObrigado por escolhe nosso banco");
                    break;

                case 1:
                    System.out.print("\nDigite o valor que pretende depositar: ");
                    deposito = read.nextDouble();
                    corrente.deposito(deposito);

                    if (deposito > 0) {
                        System.out.println("\nDeposito efetuado com sucesso");
                    }
                    System.out.println("Saldo: " + corrente.getSaldo());
                    break;

                case 2:
                    System.out.print("\nDigite o valor que pretende sacar: ");
                    saque = read.nextDouble();
                    corrente.saque(saque);

                    if (saque > 0) {
                        System.out.println("\nSaque efetuado com sucesso");
                    }
                    System.out.println("Saldo: " + corrente.getSaldo());
                    break;

                case 3:
                    System.out.print("\nUtilize _ (underline) para representar espaço \nDigite seu nome: ");
                    nome = read.next();

                    nome = nome.replaceAll("_", " ");

                    if (!nome.equals("")) {
                        corrente.alterarNome(nome);

                        System.out.println("\nNome alterado com sucesso");
                        System.out.println("Nome atualizado: " + corrente.getNome());
                    }
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;

            }

        } while (opcao != 0);
    }
}
