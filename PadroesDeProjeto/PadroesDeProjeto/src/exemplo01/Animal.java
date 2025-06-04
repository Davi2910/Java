package exemplo01;

// Neste exemplo não usaremos interfaces
public class Animal {
    private double peso;

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
    
    public void emitirSom(){
        System.out.println("arhg");
    }
}
