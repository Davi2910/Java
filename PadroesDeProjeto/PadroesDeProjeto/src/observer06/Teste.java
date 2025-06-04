package observer06;

public class Teste {
    public static void main(String[] args) {
        Acao petro = new Acao("PETR4", 30.0);
        Corretora xp = new Corretora("XP");
        Corretora btg = new Corretora("BTG");
        Investidor primoRico = new Investidor("Primo");
        
        // registrar os assinantes
        petro.registrar(xp);
        petro.registrar(btg);
        petro.registrar(primoRico);
        petro.registrar(xp);
        
        petro.setValor(31);
    }
}
