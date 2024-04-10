import java.time.LocalDate;

import Pacote.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pessoa pessoa1 = new Pessoa("Eduardo", "Cardozo Dib","cardozoedudib@gmail.com", LocalDate.of(2005, 12, 8));
        pessoa1.adicionarEmail(pessoa1.getEmail());
        System.out.println(pessoa1.getEmail());
    }
}
