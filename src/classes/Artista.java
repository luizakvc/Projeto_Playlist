package classes;

public class Artista {
    private int idCantor;
    private String nome;
    private String genero;
    private String nacionalidade;
    private String produtora;
    private String nomeDisco;

    Artista(int idCantor, String nome, String genero, String nacionalidade,
            String produtora, String nomeDisco) {
        this.idCantor = idCantor;
        this.nome = nome;
        this.genero = genero;
        this.nacionalidade = nacionalidade;
        this.produtora = produtora;
        this.nomeDisco = nomeDisco;

    }

    public String getNome() { return this.nome; }

    public String getGenero() {return genero;   }

    public String getNacionalidade() {return nacionalidade;  }

    public int getIdCantor() {return idCantor;   }

    public String getProdutora() { return produtora;  }

    public String getNomeDisco() { return nomeDisco;  }

    public void setIdCantor(int idCantor) {this.idCantor = idCantor; }

    public void setNome(String nome) {this.nome = nome; }

    public void setGenero(String genero) { this.genero = genero; }

    public void setNacionalidade(String nacionalidade) {
        if (nacionalidade.length() == 3) {
            this.nacionalidade = nacionalidade;
        } else {
            System.out.println("Nacionalidade inválida");
        }
    }

    public void setProdutora(String produtora) { this.produtora = produtora;
    }

    public void setNomeDisco(String nomeDisco) { this.nomeDisco = nomeDisco;
    }
}
