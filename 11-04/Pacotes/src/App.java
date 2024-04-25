import java.util.*;

import view.Pessoa;

import model.Cidade;
import model.DiaDaSemana;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);

        Pessoa p1 = new Pessoa("Eduardo");
        //protected funciona entre pacotes, o private funciona apenas na classe
        //p1.nome = "oi";
        System.out.println(p1.getNome());

        System.out.println(Cidade.CURITIBA);

        Cidade cidade = Cidade.CAMPO_LARGO;

        System.out.println(cidade);

        //System.out.println("Digite sua cidade");
        //Cidade novaCidade = Cidade.valueOf(scanner.nextLine().trim().replace(" ", "_").toUpperCase());
        //System.out.println(novaCidade);

        DiaDaSemana dia = DiaDaSemana.QUINTA;

        System.out.println("O dia" + dia.getDia() + dia.isEhUtil());

        String texto = "segunda-feira ";
        dia = DiaDaSemana.valueOf(texto.trim().toUpperCase().replace("-FEIRA", "").replace("FEIRA", ""));

        dia =  dia.buscarDia(texto);

    }
}
