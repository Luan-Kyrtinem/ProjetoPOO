package RegraDeNegocios;
public class Cliente {
    private String nomeCliente;
    private int idadeCliente;
    private String cpf;
    private Banco bancoDaConta;
    private Agencia agenciaDoBanco;
    private String emailCliente;
    private String numeroDoTelefone;
    public Conta contaDoCliente;
    private int nConta; 


    public Conta getContaDoCliente() {
        return contaDoCliente;
    }

    public void setContaDoCliente(Conta contaDoCliente) {
        this.contaDoCliente = contaDoCliente;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getIdadeCliente() {
        return idadeCliente;
    }

    public void setIdadeCliente(int idadeCliente) {
        this.idadeCliente = idadeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Banco getBancoDaConta() {
        return bancoDaConta;
    }

    public void setBancoDaConta(Banco bancoDaConta) {
        this.bancoDaConta = bancoDaConta;
    }

    public Agencia getAgenciaDoBanco() {
        return agenciaDoBanco;
    }

    public void setAgenciaDoBanco(Agencia agenciaDoBanco) {
        this.agenciaDoBanco = agenciaDoBanco;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getNumeroDoTelefone() {
        return numeroDoTelefone;
    }

    public void setNumeroDoTelefone(String NumeroDoTelefone) {
        this.numeroDoTelefone = NumeroDoTelefone;
    }
    

    public Cliente(String nomeCliente, int idadeCliente, String cpf, String emailCliente, String numeroDoTelefone) {
        this.nomeCliente = nomeCliente;
        this.idadeCliente = idadeCliente;
        this.cpf = cpf;
        this.emailCliente = emailCliente;
        this.numeroDoTelefone = numeroDoTelefone;
    }
    
    
    
}
