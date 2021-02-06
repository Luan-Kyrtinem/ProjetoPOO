package RegraDeNegocios;
public class Conta implements MetodosConta {
    private String tipoDeConta;
    private int numeroDaConta = 1;
    private float saldodaConta = 100;
    private Banco bancoDaConta;
    private Agencia agenciaDaConta;
    private boolean contaAberta = false;
    private ChavePIX chavePIX;

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public float getSaldodaConta() {
        return saldodaConta;
    }

    public void setSaldodaConta(float saldodaConta) {
        this.saldodaConta = saldodaConta;
    }

    public Banco getBancoDaConta() {
        return bancoDaConta;
    }

    public void setBancoDaConta(Banco bancoDaConta) {
        this.bancoDaConta = bancoDaConta;
    }

    public Agencia getAgenciaDaConta() {
        return agenciaDaConta;
    }

    public void setAgenciaDaConta(Agencia agenciaDaConta) {
        this.agenciaDaConta = agenciaDaConta;
    }

    public boolean isContaAberta() {
        return contaAberta;
    }

    public void setContaAberta(boolean contaAberta) {
        this.contaAberta = contaAberta;
    }

    public ChavePIX getChavePIX() {
        return chavePIX;
    }

    public void setChavePIX(ChavePIX chavePIX) {
        this.chavePIX = chavePIX;
    }
    
    
    
    @Override
    public void abrirConta(Cliente c, Banco b, Agencia a, float s) {
        if (this.contaAberta == false) {
            this.contaAberta = true;
            c.setnConta(this.numeroDaConta);
            this.numeroDaConta += 1;
            chavePIX.criarChaveC();
            this.bancoDaConta = b;
            this.agenciaDaConta = a;
            this.saldodaConta +=s;
        }
    }
    @Override
    public void fecharConta(Cliente c, Banco b, Agencia a) {
        if (this.contaAberta == true) {
            this.contaAberta = false;
            c.setnConta(0);
            this.numeroDaConta = 0;
            chavePIX.criarChaveC();
            this.bancoDaConta = null;
            this.agenciaDaConta = null;
            this.saldodaConta = 0;
        }
    }
    
    @Override
    public void fazerSaque(Cliente c, Banco b, Agencia a, float v) {
        //c.getContaDoCliente().setSaldodaConta(saldodaConta - v);
        System.out.println(this.getSaldodaConta());
    }
    @Override
    public void fazerDeposito(Cliente c, Banco b, Agencia a, float v) {
    }
    @Override
    public void fazerTransPIX(Cliente c, Banco b, Agencia a,ChavePIX cha, float v) {
    }
    @Override
    public void fazerTransTED(Cliente c, Banco b, Agencia a, Cliente c2, Banco b2, Agencia a2, float v) {
    }
    
}
