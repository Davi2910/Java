package poo;

public class Camaro {
    public static void main(String[] args) {
        Carro camaro = new Carro();
        camaro.ano = 2016;
        camaro.cor = "Amarelo";
        System.out.println("Carro: Camaro");
        System.out.println("Ano: " + camaro.ano);
        System.out.println("Cor: " + camaro.cor);
        camaro.ligar();
        camaro.acelerar();
        camaro.desligar();
    }

}
