/*
Crie uma classe que modele um retângulo:
Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a
escolher)
Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular Área e
calcular Perímetro;
Crie um programa que utilize esta classe. Ele deve pedir ao usuário que
informe as medidas de um local. Depois, deve criar um objeto com as
medidas e calcular a quantidade de pisos e de rodapés necessárias para o
local. */
package exercicio6;

import java.util.Scanner;

/**
 *
 * @author Mulero
 */
public class Teste6 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int base, altura, opcao;

        System.out.print("Entre com o valor da base: ");
        base = read.nextInt();

        System.out.print("Entre com o valor da altura: ");
        altura = read.nextInt();

        if (base == altura) {
            System.out.println("Informe os valores de um retângulo");
        } else {
            Retangulo modelo = new Retangulo(base, altura);

            do {
                System.out.println("\nMenu de Opções");
                System.out.println("1 - Alterar valor dos Lados");
                System.out.println("2 - Exibir valor dos Lados");
                System.out.println("3 - Calcular Área");
                System.out.println("4 - Calcular Perímetro");
                System.out.println("5 - Calcular Pisos e Rodapés");
                System.out.println("0 - Finalizar/Sair");
                System.out.print("\nEscolha uma opção: ");
                opcao = read.nextInt();

                switch (opcao) {
                    case 0:
                        System.out.println("Obrigado por usar nosso programa");
                        break;

                    case 1:
                        System.out.print("\nEntre com o novo valor da base: ");
                        base = read.nextInt();

                        System.out.print("Entre com o novo valor da altura: ");
                        altura = read.nextInt();

                        if (base == 0 || altura == 0) {
                            System.out.println("\nInforme valores diferente de 0");
                        } else {
                            modelo.alterarBase(base);
                            modelo.alterarAltura(altura);

                            System.out.println("\nLados alterados!");
                            System.out.println("Base: " + modelo.getBase() + "m");
                            System.out.println("Altura: " + modelo.getAltura() + "m");
                        }

                        break;

                    case 2:
                        System.out.println("\nBase: " + modelo.getBase() + "m");
                        System.out.println("Altura: " + modelo.getAltura() + "m");
                        break;

                    case 3:
                        System.out.println("Área: " + modelo.calcArea() + "m²");
                        break;

                    case 4:
                        System.out.println("Perímetro: " + modelo.calcPerimetro() + "m");
                        break;

                    case 5:
                        System.out.println("\nRodapés: " + modelo.calcPerimetro() + "m");
                        System.out.println("Pisos: " + modelo.calcArea() + "m");
                        break;

                    default:
                        System.out.println("Opção Inválida!!!");
                        break;

                }

            } while (opcao != 0);

        }
    }
}
