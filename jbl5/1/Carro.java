public class Carro extends Veiculo{

    private int janela;

    public Carro(int janela) {
        this.janela = janela;
    }

    @Override
    public void acelerar(){
        System.out.println("O carro esta acelerando!");
    }
}
