package exemplo03;

// Neste exemplo usaremos interfaces
public abstract class Animal implements Som{
    private double peso;
    private String tipoSanguineo;

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
}
