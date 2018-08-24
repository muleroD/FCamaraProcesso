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

/**
 *
 * @author Mulero
 */
public class Retangulo {

    private int base;
    private int altura;

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void alterarBase(int base) {
        if (base != 0) {
            this.base = base;
        }
    }

    public void alterarAltura(int altura) {
        if (altura != 0) {
            this.altura = altura;
        }
    }

    public int calcArea() {
        int area = base * altura;
        return area;
    }

    public int calcPerimetro() {
        int perimetro;

        perimetro = base * 2 + altura * 2;
        return perimetro;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}
