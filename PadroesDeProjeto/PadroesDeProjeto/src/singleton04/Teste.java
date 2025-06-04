package singleton04;

public class Teste {
    public static void main(String[] args) {
        BancoDeDados bd = BancoDeDados.getInstance();
        System.out.println(bd);
        
        BancoDeDados bd2 = BancoDeDados.getInstance();
        System.out.println(bd2);
    }
}
