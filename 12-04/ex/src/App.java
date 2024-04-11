import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercício 1");
        Agenda agenda1 = new Agenda();
        Contato c1 = new Contato("Eduardo Cardozo Dib", 123456);
        Contato c2 = new Contato("Bruno Cardozo Dib", 1234567);
        Contato c3 = new Contato("Zacarias", 1234568);
        Contato c4 = new Contato("Carlos Gomes", 123456789);
        agenda1.adicionarContato(c1);
        agenda1.adicionarContato(c2);
        agenda1.adicionarContato(c3);
        agenda1.adicionarContato(c4);
        agenda1.removerContato(c1);
        System.out.println(agenda1);
        System.out.println("\nExercício 2");

        Funcionario f1 = new Funcionario("Funcionário 1", "123", 16, "Estagiário");
        Funcionario f2 = new Funcionario("Funcionário 2", "223", 16, "Estagiário");
        Funcionario f3 = new Funcionario("Funcionário 3", "123", 16, "Estagiário");
        Funcionario f4 = new Funcionario("Funcionário 4", "423", 16, "Estagiário");
        Funcionario f5 = new Funcionario("Funcionário 4", "523", 16, "Estagiário");

        Departamento d1 = new Departamento("ADM", new ArrayList<Funcionario>());
        Departamento d2 = new Departamento("com", new ArrayList<Funcionario>());

        Empresa empresa = new Empresa(new ArrayList<Departamento>());

        empresa.adicionarDepartamento(d1);
        empresa.adicionarDepartamento(d2);

        empresa.adicionarFuncionario(f1, "ADM");
        empresa.adicionarFuncionario(f2, "ADM");
        empresa.adicionarFuncionario(f3, "ADM");
        empresa.adicionarFuncionario(f4, "com");
        empresa.adicionarFuncionario(f5, "com");
        System.out.println(empresa);
        empresa.removerFuncionario(f5, "523");
        System.out.println(empresa);
        empresa.removerDepartamento("com");
        System.out.println(empresa);

    }
}
