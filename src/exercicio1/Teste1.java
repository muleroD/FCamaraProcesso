/*
1) Um funcionário de uma empresa recebe, anualmente, aumento salarial.
Sabe-se que:
Esse funcionário foi contratado em 2005 com salário inicial de R$ 1.000,00;
Em 2006 ele recebeu aumento de 1,5% sobre seu salário inicial; e
A partir de 2007, os aumentos salariais sempre corresponderam ao dobro
do percentual do ano anterior.
Faça um algoritmo que determine o salário atual deste funcionário. */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author Mulero
 */
public class Teste1 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int ano = 7, anoAtual;
        double salario = 1000, porcentagem = 0.015;

        System.out.print("Entre com o ano atual: ");
        anoAtual = read.nextInt();

        if (anoAtual < 7) {
            System.out.println("Ano inválido !!!");
        } else {
            for (int i = ano; i < anoAtual; i++) {
                porcentagem = porcentagem * 2;
                salario = salario + (salario * porcentagem);
            }
            System.out.println("\nSeu salário atual é de:  R$" + Math.round(salario));
        }

    }
}
