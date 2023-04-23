public class Main{

    public static void main(String[] args) {

        Animal cat = new Gato();
        Animal dog = new Cachorro();

        System.out.println(cat.fazerBarulho());
        System.out.println(dog.fazerBarulho());


    }
}