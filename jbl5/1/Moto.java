public class Moto extends Veiculo{

    private String modelo;

    public Moto(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void acelerar(){
        System.out.println("A moto esta acelerando!");
    }
}
