/*
Elabore um algoritmo para mostrar os números primos existentes em um
intervalo.
O usuário deverá fornecer os valores inicial (inicial > 0) e final (inicial <
final) e os números primos existentes no intervalo ([inicial, final]) devem
ser separados por um espaço em branco

Exemplo:
Entrada: 2 13
Saída: 2 3 5 7 11 13 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author Mulero
 */
public class Teste2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int inicio, fim, aux = 0, i;
        
        //Entrada de valores
        System.out.print("Entre com o valor inicial: ");
        inicio = read.nextInt();

        System.out.print("Entre com o valor final: ");
        fim = read.nextInt();

        //Verificação dos valores
        if (inicio > 0 && inicio < fim) {
            for (i = inicio; i <= fim; i++) {

                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) { //verifica se o número é divisivel e acrescente mais um 
                        aux += 1;
                    }
                }
                
                //se na variavel auxiliar tiver 2 número quer dizer que o numero é divisivel por ele mesmo e por 1
                if (aux == 2) {
                    System.out.print(i + " ");
                }
                aux = 0;
            }
            System.out.println("");
        } else {
            System.out.println("Valores inválidos!!!");
        }

    }

}
