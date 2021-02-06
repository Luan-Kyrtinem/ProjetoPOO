package RegraDeNegocios;
public class Executar {
    public static void main(String[] args) {
       Agencia a = new Agencia(); 
       Cliente c = new Cliente("Luan", 18, "86201165509", "CC", "Kyrtinem@gmail.com", "79991141138");
       Cliente c1 = new Cliente("l", 18, "86201165509", "CC", "Kyrtinem@gmail.com", "79991141138");
       Conta co = new Conta(c, "itau", a, 100);
       //co.fazerSaque(c, co.getBancoDaConta("itau"), a, 25);
       //co2.fazerSaque(c1, b, a, 30);
       //System.out.println(co.getChaveAle());
       //System.out.println(c.contaDoCliente.getSaldodaConta());
    }
}
