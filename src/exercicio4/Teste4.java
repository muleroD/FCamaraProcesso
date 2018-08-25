/*
Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é
vendida em latas de 18 litros, que custam R$ 80,00. 
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total. */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author Mulero
 */
public class Teste4 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double precoLata = 80, precoTotal, qtLatas, coberturaTinta, metrosQuad;

        System.out.print("Informe o tamanho em metros quadrados da área a ser pintada: ");
        metrosQuad = read.nextInt();

        //calculando a quantidade de tinta que será utilizada
        coberturaTinta = metrosQuad / 3;

        System.out.println(Math.round(coberturaTinta) + "L de tinta será utilizado");

        //verifica se precisa de 1 lata ou +
        if (coberturaTinta < 19) {
            System.out.println("1 lata de tinta");
            System.out.println("Total: \tR$" + precoLata);

        } else {
            qtLatas = coberturaTinta / 18;
            precoTotal = qtLatas * precoLata;
            System.out.println(Math.round(qtLatas) + " latas de tinta");
            System.out.println("Total: \tR$" + Math.round(precoTotal));
        }
    }
}
