package RegraDeNegocios;
import java.util.Random;
public abstract class ChavePIX implements MetodosPIX {
    private String email = "";
    private String codAleatorio = "";
    private String numeroTelefone = "";
    private int numeroDeChaves = 0;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodAleatorio() {
        return codAleatorio;
    }

    public void setCodAleatorio(String codAleatorio) {
        this.codAleatorio = codAleatorio;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public int getNumeroDeChaves() {
        return numeroDeChaves;
    }

    public void setNumeroDeChaves(int numeroDeChaves) {
        this.numeroDeChaves = numeroDeChaves;
    }
    
    
    
    @Override
    public void criarChaveE(String e) {
        if (("".equals(this.email)) && (this.numeroDeChaves < 5)) {
            this.email = e;
        }
    }
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
    @Override
    public void criarChaveN(String n) {
        if (("".equals(this.numeroTelefone)) && (this.numeroDeChaves < 5)) {
            this.numeroTelefone = n;
        }
    }
    @Override
    public void apagarChaveE(String e) {
        this.email = "";
        this.numeroDeChaves -= 1;
    }
    @Override
    public void apagarChaveC(String c) {
        this.codAleatorio = "";
        this.numeroDeChaves -= 1;
    }
    @Override
    public void apagarChaveN(String n) {
        this.numeroTelefone = "";
        this.numeroDeChaves -= 1;
    }
}
