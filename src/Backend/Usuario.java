package Backend;

public class Usuario {

    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario() {
        this.nome = "";
        this.senha = "";
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getsenha() {
        return senha;
    }

    public void setsenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Users{" + "nome=" + nome + ", senha=" + senha + '}';
    }
    
    
}
