public class ContaCorrente extends Conta{

    public ContaCorrente(float saldo, int numeroConta) {
        super(saldo, numeroConta);

    }

    public float mostrarSaldo(){
        System.out.println("Seu Saldo é de " +getSaldo());

        return getSaldo();
    }
}
