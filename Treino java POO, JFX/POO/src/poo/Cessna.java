package poo;

public class Cessna {

    public static void main(String[] args) {
        Aviao cessna = new Aviao();
        cessna.ano = 2018;
        cessna.cor = "Branco";
        cessna.envergadura = 10.5;
        System.out.println("Avião: Cessna");  
        System.out.println("Ano:" + cessna.ano);
        System.out.println("Cor:" + cessna.cor);
        System.out.println("Envergadura:" + cessna.envergadura + "m"); 
        cessna.ligar();
        cessna.acelerar();
     }

}
