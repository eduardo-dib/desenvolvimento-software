import java.util.ArrayList;
import java.util.List;

public class Agenda {
    
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();  
    }


    public void adicionarContato(Contato contato){
            if(buscarContato(contato.getNome()) == null){
                 contatos.add(contato);
            }
    }

    public void removerContato(Contato contato){
        if(buscarContato(contato.getNome()) == contato){
            contatos.remove(contato);
       }
    }

    public Contato buscarContato(String nome){
        return contatos.stream().
        filter(p -> p.getNome().
        equals(nome)).
        findFirst().
        orElse(null);
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return "Agenda [contatos=" + contatos + "]";
    }

}
