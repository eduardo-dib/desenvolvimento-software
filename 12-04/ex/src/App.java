import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Agenda agenda1 = new Agenda();
        Contato c1 = new Contato("iae monark aki", 123456);
        Contato c2 = new Contato("iae monark aki", 123456);
        Contato c3 = new Contato("iae monark akiii", 123456);
        Contato c4 = new Contato("iae monark akiii", 123456);
        agenda1.adicionarContato(c1);
        agenda1.adicionarContato(c2);
        agenda1.adicionarContato(c3);
        agenda1.adicionarContato(c4);
        agenda1.removerContato(c1);
        System.out.println(agenda1);
    }
}
