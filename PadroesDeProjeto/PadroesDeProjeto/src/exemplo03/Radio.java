package exemplo03;

// Solução elegante
public class Radio implements Som {
    
    // classe Rádio NÃO herda tipoSanguineo!! 
    @Override
    public void emitirSom() {
        System.out.println("Música não tem idade tem história!");
    }
    
}
