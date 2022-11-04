package classes;

public class Ouvinte {
    private int idOuvinte;
    private String nome;
    private String nomeUsuario;
    private String email;
    private int idade;
    private String nacionalidade;
    private int idMusica;

    public Ouvinte(int idOuvinte, String nome, String nomeUsuario,
                   String email, int idade, String nacionalidade,
                   int idMusica) {
        this.idOuvinte = idOuvinte;
        this.nome = nome;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.idMusica = idMusica;
    }

    public int getIdOuvinte() { return idOuvinte;    }

    public String getNome() { return nome;    }

    public String getNomeUsuario() {  return nomeUsuario;    }

    public String getEmail() { return email;    }

    public int getIdade() {  return idade;   }

    public String getNacionalidade() {  return nacionalidade;   }

    public int getIdMusica() {  return idMusica;   }

    public void setIdOuvinte(int idOuvinte) {
        this.idOuvinte = idOuvinte;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        if (idade < 13) {
            System.out.println("Passa acessar a música deve ter permissão legal dos seus responsáveis!");
        } else {
            this.idade = idade;
        }
    }

    public void setNacionalidade(String nacionalidade) {
        if (nacionalidade.length() == 3) {
            this.nacionalidade = nacionalidade;
        } else {
            System.out.println("Nacionalidade inválida");
        }
    }

    public void setIdMusica(int idMusica) {
        this.idMusica = idMusica;
    }
}
