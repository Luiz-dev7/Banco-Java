package Conta;
public class ContaCorrente extends Conta {
     private static int SEQUENCIAL = 1;
    

    public ContaCorrente() {
        super.agencia = AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
        super.saldo = 0;
        
    }

     public void imprimirExtrato() {
            System.out.println("=== Extrato Conta Corrente ===");
            System.out.println("Agência: " + this.agencia);
            System.out.println("Número: " + this.numero);
            System.out.println("Saldo: " + this.saldo);
            System.out.println("===============================");
        }
}
