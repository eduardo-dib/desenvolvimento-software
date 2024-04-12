import java.util.*;

import view.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);

        Pessoa p1 = new Pessoa("Eduardo");
        //protected funciona entre pacotes, o private funciona apenas na classe
        p1.nome = "oi";
        System.out.println(p1.getNome());

    }
}
