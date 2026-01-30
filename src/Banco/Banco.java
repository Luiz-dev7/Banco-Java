package Banco;

import Conta.Conta;

public class Banco {
    String banco;

    public String ListarContas( Conta ContaPoupaca, Conta ContaCorrente) {
        return ContaPoupaca.getAgencia() + " - " + ContaPoupaca.getNumero() + "\n" + ContaCorrente.getAgencia() + " - " + ContaCorrente.getNumero();

    }

}
