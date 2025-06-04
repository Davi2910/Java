package exemplo03;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Gato g = new Gato();
        Radio r = new Radio();
        
        ArrayList<Som> lista = new ArrayList<>();
        lista.add(r);
        lista.add(g);
        
        for(Som s : lista){
            s.emitirSom();
        }
    }
}
