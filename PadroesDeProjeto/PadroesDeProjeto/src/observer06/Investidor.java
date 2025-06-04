package observer06;

public class Investidor implements AcaoObserver {
    private String nome;
    private String cpf;

    public Investidor(String nome) {
        this.nome = nome;
    }   
    

    @Override
    public void notificaAlteracao(Acao acao) {
        System.out.println("Vou vender com lucro!!");
        System.out.println(acao);
    }
    
}
