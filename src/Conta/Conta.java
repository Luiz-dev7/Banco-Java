package Conta;
public abstract class Conta implements Iconta {
    
    protected static final int AGENCIA_PADRAO = 14;
    protected static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;


    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque realizado na conta ");
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

        System.out.println("Depósito realizado na conta = " +  "Seu saldo atual é: " + saldo);
    }

    @Override
    public void transferir(double valor, Iconta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

        System.out.println("Transferência realizada com sucesso.");
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


}
