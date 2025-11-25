package array;

public class Array1 {

    public static void main(String[] args) {
        String[] carros = {"ferrari","Fusca","Camaro","Uno"};
         // [1] [2] [3] [4]...
        System.out.println("Tamnho do array:" + carros.length);
        System.out.println("Carro 1: " + carros[0]);
        System.out.println("Carro 2: " + carros[1]);

        //Laço for
        System.out.println("Carros:");  
        for (int i = 0; i < carros.length; i++) {
            System.out.println("Carro " + i + ": " + carros[i]);
        }

    }

}
