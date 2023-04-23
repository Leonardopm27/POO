public class ContaPoupanca extends Conta{
    public ContaPoupanca(float saldo,int  numeroConta) {
        super(saldo, numeroConta);
    }


    @Override
    public float mostrarSaldo() {
    float rendimento = (float) (super.mostrarSaldo()*0.05);
        System.out.println("Seu Saldo é de " +getSaldo());

        System.out.println("Seu rendimento é de "+rendimento);

    return rendimento;
    }
}
