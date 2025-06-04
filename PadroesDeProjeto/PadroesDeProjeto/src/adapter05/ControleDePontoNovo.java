package adapter05;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ControleDePontoNovo {
    
    public void registrarPonto(Funcionario f, boolean entrada){
        Calendar calendario = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy H:m:ss");
        String registro = sdf.format(calendario.getTime());
        if(entrada){
            System.out.println("CPN) Entrada: " + f.getNome() + " às "+ registro);
        } else {
            System.out.println("CPN) Saída..: " + f.getNome() + " às "+ registro);
        }
        
    }
}
