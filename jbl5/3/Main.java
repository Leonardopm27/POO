import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Pessoa fernando = new Pessoa( new ContaCorrente(5,1));
        Pessoa paula = new Pessoa(new ContaPoupanca(7,2));

        fernando.depositar();
        fernando.conta.mostrarSaldo();
        paula.depositar();
        paula.conta.mostrarSaldo();





    }
}