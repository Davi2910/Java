package adapter05;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ControleDePonto {
    
    public void registrarEntrada(Funcionario f){
        String registro = getRegistro();
        System.out.println("CP1) Entrada: " + f.getNome() + " às "+ registro);
    }
    
    public void registrarSaida(Funcionario f){
        String registro = getRegistro();
        System.out.println("CP1) Saída..: " + f.getNome() + " às "+ registro);
    }
    
    private String getRegistro(){
        Calendar calendario = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy H:m:ss");
        String registro = sdf.format(calendario.getTime());
        return registro;
    }
}
