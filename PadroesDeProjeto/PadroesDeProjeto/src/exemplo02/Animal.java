package exemplo02;

// Neste exemplo não usaremos interfaces
// mas usaremos classe abstrata

// Neste exemplo não usaremos interfaces
public abstract class Animal {
    private double peso;
    private String tipoSanguineo;

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
    
    // delegar a responsabilidade de implementar o
    // comportamento para as classes filhas
    public abstract void emitirSom();
}
