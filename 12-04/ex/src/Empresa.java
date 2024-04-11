import java.util.List;

public class Empresa {
    private List<Departamento> departamentos;

    public Empresa(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public Departamento buscarDepartamento(String nome){
        return departamentos.stream().
        filter(e -> e.getNome().equals(nome)).
        findFirst().
        orElse(null);
    }

    public void adicionarDepartamento(Departamento departamento){
        if(buscarDepartamento(departamento.getNome()) == null){
            departamentos.add(departamento);
        }
    }

    public void adicionarFuncionario(Funcionario funcionario, String nome){
        Departamento dep = buscarDepartamento(nome);
        if(buscFuncionarioPorCpf(funcionario.getCpf()) == null && dep != null){
            dep.adicionarFuncionario(funcionario);
        }
    }

    public void removerFuncionario(Funcionario funcionario, String cpf){
        for (Departamento departamento : departamentos) {
            departamento.getFuncionarios().remove(buscFuncionarioPorCpf(cpf));
        }
    }
    

    public void removerDepartamento(String nome){
           departamentos.remove(buscarDepartamento(nome));
        }

    public Funcionario buscFuncionarioPorCpf(String cpf){
        Funcionario f = null;
        for (Departamento departamento : departamentos) {
            f = departamento.buscarFuncionarioPorCpf(cpf);
        }
        return f;
    }
    


    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public String toString() {
        return "\nEmpresa [departamentos=" + departamentos + "]";
    }
}
