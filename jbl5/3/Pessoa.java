import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
    Scanner scanner =new Scanner(System.in);
    Conta conta;

    public Pessoa(Conta conta) {
        this.conta = conta;

    }

    ArrayList<Conta> contas = new ArrayList<>();


    public void depositar(){
        System.out.println("Escreva seu deposito");
        float deposito = scanner.nextFloat();
        conta.depositar(deposito);
        System.out.println(" Numero da sua conta: " + conta.getNumeroConta());



    }



}
