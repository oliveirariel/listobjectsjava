package aula;

public class contato {
    private String nome;
    private String telefone;

    //construtor
    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    //getters e setters
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
