package exemplo02;


// Isso é uma GAMBIARRA, pois Radio NÃO é um subtipo de Animal
public class Radio extends Animal {
    
    // classe Rádio herda tipoSanguineo!! 

    @Override
    public void emitirSom() {
        System.out.println("Música não tem idade tem história!");
    }
    
}
