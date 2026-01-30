package Conta;
public class ContaPoupaca  extends Conta {
    
   private static int SEQUENCIAL = 1;

   public ContaPoupaca() {
        super.agencia = AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
   }
     public void imprimirExtrato() {
            System.out.println("=== Extrato Conta Poupança ===");
            System.out.println("Agência: " + this.agencia);
            System.out.println("Número: " + this.numero);
            System.out.println("Saldo: " + this.saldo);
            System.out.println("===============================");
        }
}
