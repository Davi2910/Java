package adapter05;

/*
Padrão: Adapter
Tipo: padrão estrutural
Objetivo: permitir que um objeto seja substituído por outro,
    que realiza a mesma tarefa
*/
public class ControleDePontoAdapter extends ControleDePonto {
    private ControleDePontoNovo cpn;
    
    public ControleDePontoAdapter(){
        cpn = new ControleDePontoNovo();
    }
    
    @Override
    public void registrarEntrada(Funcionario f){
        cpn.registrarPonto(f, true);
    }
    
    @Override
    public void registrarSaida(Funcionario f){
        cpn.registrarPonto(f, false);
    }
}
