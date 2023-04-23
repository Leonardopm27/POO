public class Conta {
    private float saldo;
    private int numeroConta;

    public Conta(float saldo, int numeroConta) {
        this.saldo = saldo;
        this.numeroConta=numeroConta;
    }

    public void depositar(float deposito){
        saldo = saldo+deposito;

    }

    public float mostrarSaldo(){

        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo(){

        return saldo;
    }
}


