package RegraDeNegocios;
public class Executar {
    public static void main(String[] args) {
       Banco b = new Banco();
       Agencia a = new Agencia(); 
       Cliente c = new Cliente("Luan", 18, "86201165509", "CC", "Kyrtinem@gmail.com", "79991141138");
       Cliente c1 = new Cliente("l", 18, "86201165509", "CC", "Kyrtinem@gmail.com", "79991141138");
       Conta co = new Conta();
       co.fazerSaque(c, b, a, 25);
       co.fazerSaque(c1, b, a, 30);
    }
}
