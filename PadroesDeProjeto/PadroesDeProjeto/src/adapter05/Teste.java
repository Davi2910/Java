package adapter05;

public class Teste {
    public static void main(String[] args) throws InterruptedException {
        Funcionario f = new Funcionario("Neymão");        
        ControleDePonto cp = new ControleDePonto();
        
        cp.registrarEntrada(f);
        Thread.sleep(1000);
        cp.registrarSaida(f);
        
        //ControleDePontoNovo cpn = new ControleDePontoNovo();
        //cpn.registrarPonto(f, true);
        
        ControleDePontoAdapter cpa = new ControleDePontoAdapter();
        cpa.registrarEntrada(f);
        Thread.sleep(1000);
        cpa.registrarSaida(f);
        
        
        
    }
}
