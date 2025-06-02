package exemplo03;

/*
    Herança
    Gato é um subtipo de Animal
*/
public class Gato extends Animal {

    // polimorfismo, sobrescrita
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
}
