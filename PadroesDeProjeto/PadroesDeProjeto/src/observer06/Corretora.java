package observer06;

public class Corretora implements AcaoObserver{
    
    private String nome;

    public Corretora(String nome) {
        this.nome = nome;
    }

    @Override
    public void notificaAlteracao(Acao acao) {
        System.out.println("Corretora: " + nome);
        System.out.println(acao);
    }
    
}
