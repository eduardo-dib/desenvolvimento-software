import java.util.List;

public class Departamento {
  
    
    private String nome;
    private List<Funcionario> funcionarios;

    public Departamento(String nome, List<Funcionario> funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public void adicionarFuncionario(Funcionario funcionario){
        if(buscarFuncionarioPorCpf(funcionario.getCpf()) == null && buscarFuncionarioPorNome(funcionario.getNome()) == null){
            funcionarios.add(funcionario);

        }
    }

    public void removerFuncionario(String cpf){
        funcionarios.remove(buscarFuncionarioPorCpf(cpf));

    }

    public Funcionario buscarFuncionarioPorCpf(String cpf){
        return funcionarios.stream().
        filter(e -> e.getCpf().equals(cpf)).
        findFirst().
        orElse(null);
    }

    public Funcionario buscarFuncionarioPorNome(String nome){
        return funcionarios.stream().
        filter(e -> e.getCpf().equals(nome)).
        findFirst().
        orElse(null);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "\nDepartamento [nome=" + nome + ", funcionarios=" + funcionarios + "]";
    }

}
