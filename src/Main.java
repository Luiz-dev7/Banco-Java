import Banco.Banco;
import Conta.Conta;
import Conta.ContaCorrente;
import Conta.ContaPoupaca;


public class Main {
    public static void main (String[] args){
        Conta cc = new ContaCorrente();
        Conta poupaca = new ContaPoupaca();
        Banco bradesco = new Banco();

        cc.depositar(100);  
        cc.imprimirExtrato();

        poupaca.imprimirExtrato();
        cc.transferir(50, poupaca);
    
        cc.imprimirExtrato();
        poupaca.imprimirExtrato();

        System.out.println(bradesco.ListarContas(poupaca, cc));

        
}


}
