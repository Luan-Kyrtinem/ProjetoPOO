package RegraDeNegocios;

import java.util.Random;

public class CodAleatorio extends ChavePIX {
    private String codAleatorio = "";
    private int numeroDeChaves = 0;
    @Override
    public void criarChaveC() {
        if (("".equals(this.codAleatorio)) && (this.numeroDeChaves < 5)) {
            for (int i = 0; i < 20; i++) {
            Random aleatorio = new Random();
            int valor = aleatorio.nextInt((9 - 0) + 1) + 0;
            this.codAleatorio += valor;
            }
        }
}
    
}
