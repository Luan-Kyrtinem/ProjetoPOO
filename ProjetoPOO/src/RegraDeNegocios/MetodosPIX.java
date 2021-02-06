package RegraDeNegocios;
public interface MetodosPIX {
    public abstract void criarChaveE(String e);
    public abstract void criarChaveC();
    public abstract void criarChaveN(String n);
    public abstract void apagarChaveE(String e);
    public abstract void apagarChaveC(String c);
    public abstract void apagarChaveN(String n);
}
