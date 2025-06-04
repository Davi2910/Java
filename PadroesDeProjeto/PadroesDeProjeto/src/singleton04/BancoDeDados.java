package singleton04;

/*
  Padrão: Singleton
  Tipo: padrão criacional
*/
public class BancoDeDados {
    private static BancoDeDados referencia;
    
    // ponto de acesso!
    public static BancoDeDados getInstance(){
        if (referencia == null){// não foi instanciada
            referencia = new BancoDeDados();
        }
        return referencia;
    }
    
    
    // construtor privado
    private BancoDeDados(){
        System.out.println("Conexão realizada com sucesso!");
    }
    
    
}
