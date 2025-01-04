package poo;

public class Uno {
    public static void main(String[] args) {
        Carro uno = new Carro(1987, "Preto");
        System.out.println("Carro: Uno");
        System.out.println("Ano:" + uno.ano);
        System.out.println("Cor:" + uno.cor);
        uno.ligar();
    }

}
