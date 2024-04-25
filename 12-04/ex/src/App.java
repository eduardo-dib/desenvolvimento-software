import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercício 1 \n");
        Agenda agenda1 = new Agenda();
        Contato c1 = new Contato("Eduardo Cardozo Dib", 123456);
        Contato c2 = new Contato("Bruno Cardozo Dib", 1234567);
        Contato c3 = new Contato("Rubens de oliveira", 123456);
        Contato c4 = new Contato("Eduardo Cardozo Dib", 123456);
        agenda1.adicionarContato(c1);
        agenda1.adicionarContato(c2);
        agenda1.adicionarContato(c3);
        agenda1.adicionarContato(c4);
        agenda1.removerContato(c1);
        System.out.println(agenda1);

        System.out.println("----------------------------");
        System.out.println("Exercício 2 \n");
        CadastroProdutos cadastro1 = new CadastroProdutos();
        Produto p1 = new Produto("Cafeteira", 230);
        Produto p2 = new Produto("Computador", 4500);
        Produto p3 = new Produto("Celular", 2500);
        cadastro1.adicionarProduto(p1);
        cadastro1.adicionarProduto(p2);
        cadastro1.adicionarProduto(p3);
        System.out.println(cadastro1);
        System.out.println(cadastro1.buscarProduto(2));
        System.out.println(cadastro1.buscarProduto(3));
        





    }
}
