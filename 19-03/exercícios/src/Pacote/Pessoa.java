package Pacote;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pessoa {
    private String Nome;
    private String Sobrenome;
    private LocalDate DataNascimento;
    private String email;

public Pessoa(String Nome, String Sobrenome, String email, LocalDate DataNascimento) {
     this.Nome = Nome;
     this.Sobrenome = Sobrenome;
     this.email = email;
     this.DataNascimento = DataNascimento;
 }

 public Pessoa(){

 }

public String getNome() {
    return Nome;
}

public void setNome(String Nome) {
    this.Nome = Nome;
}

public String getSobrenome() {
    return Sobrenome;
}

public void setSobrenome(String Sobrenome) {
    this.Sobrenome = Sobrenome;
}

public LocalDate getDataNascimento() {
    return DataNascimento;
}

public void setDataNascimento(LocalDate dataNascimento) {
    this.DataNascimento = dataNascimento;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

private long idade(){
    LocalDate dataAtual = LocalDate.now();
    long idade = ChronoUnit.YEARS.between(DataNascimento, dataAtual);
    return idade;



 }
private boolean validaEmail(){
    // Expressão regular para verificar se o e-mail contém um "@" e um "."
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        // Compila a expressão regular
        Pattern pattern = Pattern.compile(regex);

        // Cria um objeto Matcher para o e-mail
        Matcher matcher = pattern.matcher(email);

        // Verifica se o e-mail corresponde à expressão regular
        if(matcher.matches()){
            return true;
        }
        else{
            return false;
        }

}
public void adicionarEmail(String email){
    if(validaEmail() == true){
         this.email = email;
    }

}
public String getInformacoes(){
    return idade() + this.Sobrenome + this.Nome + this.email;
 }
}

