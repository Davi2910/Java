package observer06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Acao {
    private String ticker; // PETR4
    private double valor;
    private Set<AcaoObserver> assinantes;

    public Acao(String ticker, double valor) {
        this.ticker = ticker;
        this.valor = valor;
        this.assinantes = new HashSet<>();
    }
    
    public void registrar(AcaoObserver interessado){
        this.assinantes.add(interessado);
    }
    
    public void descadastrar(AcaoObserver interessado){
        this.assinantes.remove(interessado);
    }

    public double getValor() {
        return valor;
    }

    public String getTicker() {
        return ticker;
    }

    @Override
    public String toString() {
        return ticker + ": R$ " + valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
        // notifica aos assinantes que este objeto foi alterado
        for(AcaoObserver assinante : assinantes){
            assinante.notificaAlteracao(this);
        }
    }
}
