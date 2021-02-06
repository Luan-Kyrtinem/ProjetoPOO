package RegraDeNegocios;
public interface MetodosConta {
    public abstract void fecharConta(Cliente c, Banco b, Agencia a);
    public abstract void fazerSaque(Cliente c, Banco b, Agencia a, float v);
    public abstract void fazerDeposito(Cliente c, Banco b, Agencia a, float v);
    public abstract void fazerTransPIX(Cliente c, Banco b, Agencia a,ChavePIX cha, float v);
    public abstract void fazerTransTED(Cliente c, Banco b, Agencia a, Cliente c2, Banco b2, Agencia a2, float v);
    
}
