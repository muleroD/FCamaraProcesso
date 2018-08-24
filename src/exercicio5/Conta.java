/*
Crie uma classe para implementar uma conta corrente. A classe deve
possuir os seguintes atributos: número da conta, nome do correntista e
saldo. Os métodos são os seguintes: alterarNome, depósito e saque; No
construtor, saldo é opcional, com valor default zero e os demais atributos
são obrigatórios. */
package exercicio5;

/**
 *
 * @author Mulero
 */
public class Conta {

    private int numeroConta;
    private String nome;
    private double saldo;

    public Conta(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = 0;
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void deposito(double valor) {
        if (valor != 0) {
            this.saldo = this.saldo + valor;
        }
    }

    public void saque(double valor) {
        if (valor != 0) {
            this.saldo = this.saldo - valor;
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
