package RegraDeNegocios;
public class Banco {
    private String nomeBanco;
    private int codigoBanco;
    private float saldoBanco;

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public int getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(int codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public float getSaldoBanco() {
        return saldoBanco;
    }

    public void setSaldoBanco(float saldoBanco) {
        this.saldoBanco = saldoBanco;
    }

    public Banco(String nomeBanco, int codigoBanco, float saldoBanco) {
        this.nomeBanco = nomeBanco;
        this.codigoBanco = codigoBanco;
        this.saldoBanco = saldoBanco;
    }
    
}
