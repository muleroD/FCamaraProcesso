/*
Receba o número de horas trabalhadas por uma pessoa e o valor do
salário mínimo e mostre o salário a receber baseado nas seguintes regras:
• A hora trabalhada equivale a 10% do salário mínimo informado;
• O salário bruto é dado pelo número de horas trabalhadas multiplicado pelo valor de cada hora;
• O imposto pago é de 3%.
• O salário a receber é equivalente ao salário bruto subtraído do imposto. */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author Mulero
 */
public class Teste3 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double horaTrabalho, sal_min, sal_bruto, sal_receber, hrsTrabalhadas;

        System.out.print("Digite o número de horas trabalhadas: ");
        horaTrabalho = read.nextInt();

        System.out.print("Digite o valor do salário mínimo: ");
        sal_min = read.nextInt();

        hrsTrabalhadas = sal_min * 0.1;
        sal_bruto = horaTrabalho * hrsTrabalhadas;
        sal_receber = sal_bruto - (sal_bruto * 0.03);

        System.out.println("\nSalário a receber: R$" + Math.round(sal_receber));

    }
}
