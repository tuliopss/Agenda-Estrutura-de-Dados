import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contato {
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate data;
    private String nome, telefone, email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getData() {
        return data.format(formato);
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


//

    public Contato(String nome, String telefone, String email, LocalDate data) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.data = data;
    }
}
